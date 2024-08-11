package com.rahul.jetpackcomponent.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rahul.jetpackcomponent.databinding.ActivityMainBinding
import com.rahul.jetpackcomponent.model.Quot
import com.rahul.jetpackcomponent.model.QuotModel
import com.rahul.jetpackcomponent.viewmodel.QuotViewModel
import com.rahul.jetpackcomponent.viewmodel.QuotViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  viewModel: QuotViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this,QuotViewModelFactory(application))[QuotViewModel::class.java]

        setQuote(viewModel.getQuotes()!!)

        binding.tvNext.setOnClickListener {
            setQuote(viewModel.nextQuotes()!!)
        }

        binding.tvPre.setOnClickListener {
            setQuote(viewModel.previousQuotes()!!)
        }
        binding.fltBtnShare.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, viewModel.getQuotes()?.quote)
            startActivity(intent)
        }
    }

    private fun setQuote(quote:Quot){
        binding.tvQuot.text = quote.quote
        binding.tvWriter.text = quote.author
    }


}