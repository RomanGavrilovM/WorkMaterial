package com.example.workmaterial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.workmaterial.R
import com.example.workmaterial.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (savedInstanceState==null){
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<BasicFragment>(R.id.fragment_container_view)

            }
        }
    }
}