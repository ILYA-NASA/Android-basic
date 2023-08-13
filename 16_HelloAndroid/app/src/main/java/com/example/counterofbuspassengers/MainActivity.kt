package com.example.counterofbuspassengers

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.counterofbuspassengers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var counter = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.resetButton.setOnClickListener {
            counter = 0
            setVisibleView(0)
        }
        binding.plusButton.setOnClickListener {
            counter++
            setVisibleView(1)
        }
        binding.minusButton.setOnClickListener {
            maxOf(MIN_PASSENGERS, counter--).also { counter = it - 1 }
            setVisibleView(2)
        }
    }

    private fun setVisibleView(currentView: Int) {
        binding.counterTextView.text = counter.toString()
        "Seats left: ${MAX_PASSENGERS - counter}".also {
            binding.currentSeatsTextView.text = it
        }
        when (currentView) {
            0 -> {
                binding.resetButton.visibility = View.INVISIBLE
                binding.tooManyPassengersTextView.visibility = View.INVISIBLE
                binding.freeSeatsTextView.visibility = View.VISIBLE
            }

            1 -> {
                binding.freeSeatsTextView.visibility = View.INVISIBLE
                binding.currentSeatsTextView.visibility = View.VISIBLE
                if (counter >= MAX_PASSENGERS) {
                    binding.currentSeatsTextView.visibility = View.INVISIBLE
                    binding.tooManyPassengersTextView.visibility = View.VISIBLE
                    binding.resetButton.visibility = View.VISIBLE
                }
            }

            2 -> {
                if (counter < MAX_PASSENGERS) {
                    binding.tooManyPassengersTextView.visibility = View.INVISIBLE
                    binding.resetButton.visibility = View.INVISIBLE
                    binding.currentSeatsTextView.visibility = View.VISIBLE
                }
                if (counter == 0) {
                    binding.currentSeatsTextView.visibility = View.INVISIBLE
                    binding.freeSeatsTextView.visibility = View.VISIBLE
                }
            }
        }
    }

    companion object {
        const val MIN_PASSENGERS = 1
        const val MAX_PASSENGERS = 5
    }
}