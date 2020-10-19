package com.anushka.androidArchitectureComponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    var total = MutableLiveData<Int>()

    init {
        total.value = startingTotal
    }

    fun setTotal(input: Int) {
        total.value = (total.value)?.plus(input)
    }
}