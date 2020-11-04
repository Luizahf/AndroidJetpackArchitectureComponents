package com.anushka.androidArchitectureComponents.ViewModelExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anushka.androidArchitectureComponents.R
import com.anushka.androidArchitectureComponents.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var viewModel: MainActivity2ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        viewModel = ViewModelProvider(this).get(MainActivity2ViewModel::class.java)
        binding.myViewModel = viewModel
        viewModel.count.observe(this, Observer {
            binding.countText.text = it.toString()
        })

    }
}