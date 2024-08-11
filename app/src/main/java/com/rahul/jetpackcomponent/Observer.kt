package com.rahul.jetpackcomponent

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleEventObserver {


    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event.name){
            Lifecycle.Event.ON_START.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_START.name}")
            }
            Lifecycle.Event.ON_CREATE.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_CREATE.name}")
            }
            Lifecycle.Event.ON_RESUME.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_RESUME.name}")
            }
            Lifecycle.Event.ON_PAUSE.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_PAUSE.name}")
            }
            Lifecycle.Event.ON_STOP.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_STOP.name}")
            }
            Lifecycle.Event.ON_DESTROY.name -> {
                Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_DESTROY.name}")
            }
        }

        if(event == Lifecycle.Event.ON_ANY){
            Log.d("TAG", "onStateChanged: ${Lifecycle.Event.ON_ANY.name}")
        }
    }
}