package com.websarva.wings.android.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleSample", "Sub onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    public override fun onStart() {
        Log.i("LifecycleSample", "Sub onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("LifecycleSample", "Sub onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("LifecycleSample", "Sub onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("LifecycleSample", "Sub onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("LifecycleSample", "Sub onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("LifecycleSample", "Sub onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
        finish()
    }
}