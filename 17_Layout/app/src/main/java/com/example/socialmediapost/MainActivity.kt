package com.example.socialmediapost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialmediapost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.customSmp.setName("ILYA NASA")
        binding.customSmp.setStatus("Learning Android SDK")
    }
}