package com.example.ppt.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityLinearLayoutBinding

class LinearLayoutActivity : AppCompatActivity() {

    lateinit var binding:ActivityLinearLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}