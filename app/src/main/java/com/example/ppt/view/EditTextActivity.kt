package com.example.ppt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityButtonBinding
import com.example.ppt.databinding.ActivityEditTextBinding

class EditTextActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}