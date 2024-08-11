package com.rahul.jetpackcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rahul.jetpackcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel=ViewModelProvider(this)[CounterViewModel::class.java]
        setData()

        binding.btnadd.setOnClickListener {
            viewModel.increment()
            setData()
        }
    }

    private fun setData() {
        binding.tvCounter.text=viewModel.count.toString()
    }


}