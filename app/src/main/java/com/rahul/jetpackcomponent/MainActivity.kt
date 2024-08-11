package com.rahul.jetpackcomponent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rahul.jetpackcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnadd.setOnClickListener {
            increment()
        }
    }

    private fun increment(){
        count++
        binding.tvCounter.text = count.toString()
    }
}