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
        binding.buttonStartStop.text = "START"

        binding.buttonStartStop.setOnClickListener {
            currentProgress++
            binding.buttonStartStop.text = "STOP"
            binding.progressBarCircular.progress = currentProgress
        }
    }
}