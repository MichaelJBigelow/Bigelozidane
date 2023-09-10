package com.bigelowinventions.bigelozidane.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bigelozidane"
    }
    val text: LiveData<String> = _text
}