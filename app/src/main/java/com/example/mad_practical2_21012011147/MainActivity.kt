package com.example.mad_practical2_21012011147

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("OnCreate() method is called")
    }
    override fun onStart() {
        super.onStart()
        showMessage("OnStart() method is called")
    }
    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }
    override fun onPause() {
        super.onPause()
        showMessage("OnPouse() method is called")
    }
    override fun onStop() {
        super.onStop()
        showMessage("OnStop() method is called")
    }
    override fun onRestart() {
        super.onRestart()
        showMessage("OnRestart() method is called")
    }
    fun showMessage(msg:String){
        Log.i(TAG,"$msg")
        Toast.makeText(this,"$msg",Toast.LENGTH_SHORT).show()
    }
}