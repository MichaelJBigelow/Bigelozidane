package com.bigelowinventions.bigelozidane.ui.links

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LinksViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Links Fragment"
    }
    val text: LiveData<String> = _text
}