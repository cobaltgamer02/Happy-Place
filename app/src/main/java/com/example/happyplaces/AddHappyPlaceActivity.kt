package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happyplaces.databinding.ActivityAddHappyPlaceBinding

class AddHappyPlaceActivity : AppCompatActivity() {
    private var binding: ActivityAddHappyPlaceBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlaceBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.tbAddPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding?.tbAddPlace?.setNavigationOnClickListener {
            onBackPressed()
        }

    }

    override fun onDestroy(){
        super.onDestroy()
        binding=null
    }
}