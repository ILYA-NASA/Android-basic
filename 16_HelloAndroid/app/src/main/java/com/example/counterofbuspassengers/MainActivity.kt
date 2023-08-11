package com.example.counterofbuspassengers

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.counterofbuspassengers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.seatsStatus.text = "Все места свободны"
        binding.seatsCounter.text = counter.toString()

        binding.counterReset.setOnClickListener {
            counter = 0
            binding.seatsCounter.text = counter.toString()
        }

        binding.incrementButton.setOnClickListener {
            counter++
            binding.seatsCounter.text = counter.toString()
            if (counter >= MAX_PASSENGERS) {
                binding.counterReset.visibility = View.VISIBLE
            }
        }

        binding.decrementButton.setOnClickListener {
            maxOf(MIN_PASSENGERS, counter--).also { counter = it - 1 }
            binding.seatsCounter.text = counter.toString()
        }

    }

    companion object {
        const val MIN_PASSENGERS = 1
        const val MAX_PASSENGERS = 50
    }
}