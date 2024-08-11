package com.rahul.jetpackcomponent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Log.d("Activity", "onStart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity", "onStop")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity", "onRestart")
    }
}