package com.example.workmaterial.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.workmaterial.R
import com.example.workmaterial.ui.fragment.DailyImageFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = DailyImageFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_daily, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()

    }
}