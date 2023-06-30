package com.example.ppt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppt.databinding.ActivityMainBinding
import com.example.ppt.ext.startActivity
import com.example.ppt.view.ButtonActivity
import com.example.ppt.view.EditTextActivity
import com.example.ppt.view.ImageViewActivity
import com.example.ppt.view.TextViewActivity
import com.example.ppt.viewgroup.CardViewActivity
import com.example.ppt.viewgroup.LinearLayoutActivity
import com.example.ppt.viewgroup.RelativeLayoutActivity
import com.example.ppt.viewgroup.ScrollViewActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Button.setOnClickListener {
            startActivity<ButtonActivity>()
        }
        binding.textView.setOnClickListener {
            startActivity<TextViewActivity>()
        }

        binding.ImageView.setOnClickListener {
            startActivity<ImageViewActivity>()
        }
        binding.EditText.setOnClickListener {
            startActivity<EditTextActivity>()
        }
        binding.Card.setOnClickListener {
            startActivity<CardViewActivity>()
        }
        binding.LinearLayout.setOnClickListener {
            startActivity<LinearLayoutActivity>()
        }
        binding.RelativeLayout.setOnClickListener {
            startActivity<RelativeLayoutActivity>()
        }
        binding.ScrollView.setOnClickListener {
            startActivity<ScrollViewActivity>()
        }

    }
}