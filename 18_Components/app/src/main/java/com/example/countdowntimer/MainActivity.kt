package com.example.countdowntimer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.countdowntimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var currentProgress = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val updateProgress = {
            binding.buttonStartStop.text = "START"
            binding.slider.isEnabled = true
            currentProgress = binding.slider.value.toInt()
            binding.progressBarCircular.max = currentProgress
            binding.textCounter.text = currentProgress.toString()
            binding.progressBarCircular.progress = currentProgress
        }
        updateProgress()
        binding.slider.addOnChangeListener { _, _, _ ->
            updateProgress()
        }
        binding.buttonStartStop.setOnClickListener {
            if (currentProgress > 0) {
                binding.buttonStartStop.text = "STOP"
                binding.slider.isEnabled = false
                currentProgress--
                binding.textCounter.text = currentProgress.toString()
                binding.progressBarCircular.progress = currentProgress
            } else updateProgress.invoke()
        }
    }
}