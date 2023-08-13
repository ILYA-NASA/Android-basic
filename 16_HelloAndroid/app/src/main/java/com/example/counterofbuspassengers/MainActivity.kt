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
        binding.freeSeatsTextView.visibility = View.VISIBLE
        binding.counterTextView.text = counter.toString()

        binding.resetButton.setOnClickListener {
            counter = 0
            binding.counterTextView.text = counter.toString()
            binding.resetButton.visibility = View.INVISIBLE
            binding.tooManyPassengersTextView.visibility = View.INVISIBLE
            binding.freeSeatsTextView.visibility = View.VISIBLE
        }

        binding.plusButton.setOnClickListener {
            counter++
            binding.counterTextView.text = counter.toString()
            binding.freeSeatsTextView.visibility = View.INVISIBLE
            binding.currentSeatsTextView.visibility = View.VISIBLE
            "Seats left: ${MAX_PASSENGERS - counter}".also { binding.currentSeatsTextView.text = it }
            if (counter >= MAX_PASSENGERS) {
                binding.currentSeatsTextView.visibility = View.INVISIBLE
                binding.tooManyPassengersTextView.visibility = View.VISIBLE
                binding.resetButton.visibility = View.VISIBLE
            }
        }

        binding.minusButton.setOnClickListener {
            maxOf(MIN_PASSENGERS, counter--).also { counter = it - 1 }
            binding.counterTextView.text = counter.toString()
            if (counter < MAX_PASSENGERS) {
                binding.tooManyPassengersTextView.visibility = View.INVISIBLE
                binding.resetButton.visibility = View.INVISIBLE
                binding.currentSeatsTextView.visibility = View.VISIBLE
                "Seats left: ${MAX_PASSENGERS - counter}".also { binding.currentSeatsTextView.text = it }
            }
            if (counter == 0) {
                binding.currentSeatsTextView.visibility = View.INVISIBLE
                binding.freeSeatsTextView.visibility = View.VISIBLE
            }
        }

    }

    companion object {
        const val MIN_PASSENGERS = 1
        const val MAX_PASSENGERS = 5
    }
}