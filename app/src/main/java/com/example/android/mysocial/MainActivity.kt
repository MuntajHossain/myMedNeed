package com.example.android.mysocial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.mysocial.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main2)
    }
}