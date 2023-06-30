package com.example.ppt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityButtonBinding
import com.example.ppt.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}