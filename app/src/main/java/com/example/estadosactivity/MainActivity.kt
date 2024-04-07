package com.example.estadosactivity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.estadosactivity.databinding.ActivityMainBinding
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag: String = "INF-STATE";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag,"MainActivity-->onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.i(tag, "MainActivity-->onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(tag, "MainActivity-->onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(tag, "MainActivity-->onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(tag, "MainActivity-->onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "MainActivity-->onDestroy")
    }
}