package com.example.ppt.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.R
import com.example.ppt.databinding.ActivityCardViewBinding

class CardViewActivity : AppCompatActivity() {
    lateinit var binding:ActivityCardViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}