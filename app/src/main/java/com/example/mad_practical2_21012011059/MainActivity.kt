package com.example.mad_practical2_21012011059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="Mainactivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("oncreate method is called");
    }

    override fun onStart() {
        super.onStart()
        showMessage("onstart method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onresume method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onrestart method is called")
    }

    
    fun showMessage(message:String) {
        Log.i(TAG,message)
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}