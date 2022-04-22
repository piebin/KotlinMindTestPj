package com.example.kotlin_mind_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_mind_test.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}