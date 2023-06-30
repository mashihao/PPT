package com.example.ppt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {

    lateinit var binding: ActivityButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}