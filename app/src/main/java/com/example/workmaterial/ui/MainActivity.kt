package com.example.workmaterial.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.workmaterial.R
import com.example.workmaterial.databinding.ActivityMainBinding
import com.example.workmaterial.ui.fragment.DailyImageFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO)
        setTheme(Const.currentTheme);
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment = DailyImageFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_daily, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()


    }
}