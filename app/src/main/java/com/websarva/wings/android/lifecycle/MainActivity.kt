package com.websarva.wings.android.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleSample", "Main onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onStart() {
        Log.i("LifecycleSample", "Main onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("LifecycleSample", "Main onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("LifecycleSample", "Main onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("LifecycleSample", "Main onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("LifecycleSample", "Main onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("LifecycleSample", "Main onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this@MainActivity, SubActivity::class.java)
        startActivity(intent)
    }
}
