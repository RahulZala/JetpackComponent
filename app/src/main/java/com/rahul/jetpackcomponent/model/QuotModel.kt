package com.rahul.jetpackcomponent.model

data class QuotModel(
    val quotes: List<Quot>?=null
)

data class Quot(val quote:String, val author:String)
