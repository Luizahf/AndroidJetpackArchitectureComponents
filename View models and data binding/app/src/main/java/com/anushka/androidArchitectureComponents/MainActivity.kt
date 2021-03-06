package com.anushka.androidArchitectureComponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anushka.androidArchitectureComponents.NavigationClass.Navigation01Activity
import com.anushka.androidArchitectureComponents.ViewModelExample.MainActivity2
import com.anushka.androidArchitectureComponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        viewModel.totalData.observe(this, Observer {
            binding.inputEditText.text = it.toString()
        })
        binding.student = getStudent()

        binding.button.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
        }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    private fun getStudent(): Student {
        return Student(1, "Luiza", "luizahfreire@hotmail.com")
    }
}
