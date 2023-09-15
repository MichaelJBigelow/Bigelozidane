package com.bigelowinventions.bigelozidane.ui.translator

import androidx.annotation.MainThread
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bigelowinventions.bigelozidane.logic.Cipher

class TranslatorViewModel : ViewModel() {
    val inputText: MutableLiveData<String> = MutableLiveData<String>("")
    val outputText: MutableLiveData<String> = MutableLiveData<String>("")

    @MainThread
    fun encode() {
        outputText.postValue(
            Cipher.encode(inputText.value.toString())
        )
    }
}