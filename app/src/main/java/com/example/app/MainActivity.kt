package com.example.app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        "Hello From Android".toast(context)
        fun Any.toast(context: Context, duration: Int = Toast.LENGTH_SHORT): Toast {
            return Toast.makeText(context, this.toString(), duration).apply { show() }
        }
        
    }
}