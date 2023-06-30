package com.example.ppt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityTextviewBinding

class TextViewActivity : AppCompatActivity() {

    lateinit var binding :ActivityTextviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextviewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}