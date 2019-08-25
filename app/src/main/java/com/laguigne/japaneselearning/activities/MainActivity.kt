package com.laguigne.japaneselearning.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.laguigne.japaneselearning.R

class MainActivity : AppCompatActivity() {

    private lateinit var learningPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        learningPager = findViewById(R.id.vp_learning)
    }
}
