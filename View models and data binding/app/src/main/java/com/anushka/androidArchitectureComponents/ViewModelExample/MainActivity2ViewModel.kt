package com.anushka.androidArchitectureComponents.ViewModelExample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainActivity2ViewModel : ViewModel() {
    var count = MutableLiveData<Int>()
    val countData : LiveData<Int> get() = count

    init {
        count.value = 0
    }

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }
}