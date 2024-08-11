package com.rahul.jetpackcomponent.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahul.jetpackcomponent.model.QuotModel

class QuotViewModel(val context: Context) :ViewModel(){

    private var quotes = QuotModel()
    var index=0
    init {
        quotes= loadQuotesFromAssert()!!
    }

    fun getQuotes()= quotes.quotes?.get(index)

    fun nextQuotes()=quotes.quotes?.get(++index)

    fun previousQuotes()= quotes.quotes?.get(if(index<=0)0 else --index)

    private fun loadQuotesFromAssert(): QuotModel? {
        val inputStream = context.assets.open("quotes.json")
        val size :Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer,Charsets.UTF_8)
        val gson = com.google.gson.Gson()
        return gson.fromJson(json,QuotModel::class.java)
    }

}