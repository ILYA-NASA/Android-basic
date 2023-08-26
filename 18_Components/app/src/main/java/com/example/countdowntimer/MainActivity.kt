package com.example.countdowntimer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.countdowntimer.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var currentProgress = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        updateProgress()
        binding.slider.addOnChangeListener { _, _, _ ->
            updateProgress()
        }
        binding.buttonStart.setOnClickListener {
            startCountdownTimer()
        }
    }

    private fun updateProgress() {
        binding.slider.isEnabled = true
        binding.buttonStart.visibility = View.VISIBLE
        binding.textTimerTaskFinished.visibility = View.INVISIBLE
        binding.buttonStop.visibility = View.INVISIBLE
        currentProgress = binding.slider.value.toInt()
        binding.progressBarCircular.max = currentProgress
        binding.textCounter.text = currentProgress.toString()
        binding.progressBarCircular.progress = currentProgress
    }

    private fun startCountdownTimer() {
        binding.slider.isEnabled = false
        binding.buttonStart.visibility = View.INVISIBLE
        binding.buttonStop.visibility = View.VISIBLE
        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            while (currentProgress != 0) {
                binding.buttonStop.setOnClickListener {
                    scope.cancel()
                    updateProgress()
                }
                delay(1000)
                currentProgress--
                binding.textCounter.text = currentProgress.toString()
                binding.progressBarCircular.progress = currentProgress
            }
            binding.textTimerTaskFinished.visibility = View.VISIBLE
            delay(1000)
            scope.cancel()
            updateProgress()
        }
    }
}