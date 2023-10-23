package com.app.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.notification.databinding.ActivityMainBinding
import com.app.notification.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding:ActivitySecondBinding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.textView.text = intent.getStringExtra("DATA_REC")
    }
}