package com.bigelowinventions.bigelozidane.ui.translator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TranslatorViewModel : ViewModel() {
    val inputText: LiveData<String> = MutableLiveData<String>()
    val outputText: LiveData<String> = MutableLiveData<String>()
}