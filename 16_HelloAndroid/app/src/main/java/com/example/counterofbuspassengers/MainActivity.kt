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
        binding.emptyBus.visibility = View.VISIBLE
        binding.seatsCounter.text = counter.toString()

        binding.counterReset.setOnClickListener {
            counter = 0
            binding.seatsCounter.text = counter.toString()
            binding.counterReset.visibility = View.INVISIBLE
            binding.fullBus.visibility = View.INVISIBLE
            binding.emptyBus.visibility = View.VISIBLE
        }

        binding.incrementButton.setOnClickListener {
            counter++
            binding.seatsCounter.text = counter.toString()
            binding.emptyBus.visibility = View.INVISIBLE
            binding.seatsStatus.visibility = View.VISIBLE
            "Seats left: ${MAX_PASSENGERS - counter}".also { binding.seatsStatus.text = it }
            if (counter >= MAX_PASSENGERS) {
                binding.seatsStatus.visibility = View.INVISIBLE
                binding.fullBus.visibility = View.VISIBLE
                binding.counterReset.visibility = View.VISIBLE
            }
        }

        binding.decrementButton.setOnClickListener {
            maxOf(MIN_PASSENGERS, counter--).also { counter = it - 1 }
            binding.seatsCounter.text = counter.toString()
            if (counter < MAX_PASSENGERS) {
                binding.fullBus.visibility = View.INVISIBLE
                binding.counterReset.visibility = View.INVISIBLE
                binding.seatsStatus.visibility = View.VISIBLE
                "Seats left: ${MAX_PASSENGERS - counter}".also { binding.seatsStatus.text = it }
            }
            if (counter == 0) {
                binding.seatsStatus.visibility = View.INVISIBLE
                binding.emptyBus.visibility = View.VISIBLE
            }
        }

    }

    companion object {
        const val MIN_PASSENGERS = 1
        const val MAX_PASSENGERS = 50
    }
}