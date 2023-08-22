package com.example.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    private var currentProgress = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circleProgress = findViewById<ProgressBar>(R.id.progressBarCircular)
        val buttonStartStop = findViewById<Button>(R.id.buttonStartStop)
        buttonStartStop.text = "START"
        val slider = findViewById<Slider>(R.id.slider)

        val updateProgress = {
            circleProgress.progress = currentProgress
        }

        buttonStartStop.setOnClickListener {
            currentProgress++
            buttonStartStop.text = "STOP"
            updateProgress()
        }
    }
}