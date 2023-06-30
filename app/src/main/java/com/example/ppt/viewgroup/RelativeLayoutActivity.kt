package com.example.ppt.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityLinearLayoutBinding
import com.example.ppt.databinding.ActivityRelativeLayoutBinding

class RelativeLayoutActivity : AppCompatActivity() {

    lateinit var binding: ActivityRelativeLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}