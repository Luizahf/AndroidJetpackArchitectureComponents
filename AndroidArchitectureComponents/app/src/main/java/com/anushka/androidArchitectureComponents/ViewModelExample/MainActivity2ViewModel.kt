package com.anushka.androidArchitectureComponents.ViewModelExample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainActivity2ViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }
}