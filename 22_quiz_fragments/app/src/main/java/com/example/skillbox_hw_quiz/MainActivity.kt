package com.example.skillbox_hw_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillbox_hw_quiz.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}