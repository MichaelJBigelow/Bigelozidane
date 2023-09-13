package com.bigelowinventions.bigelozidane.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val inputText: LiveData<String> = MutableLiveData<String>()
    val outputText: LiveData<String> = MutableLiveData<String>()
}