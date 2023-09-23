package com.bigelowinventions.bigelozidane.ui.translator

import androidx.annotation.MainThread
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bigelowinventions.bigelozidane.logic.Cipher

class DecoderViewModel : ViewModel() {
    val inputText: MutableLiveData<String> = MutableLiveData<String>("")
    val outputText: MutableLiveData<String> = MutableLiveData<String>("")

    @MainThread
    fun decode() {
        outputText.postValue(
            Cipher.decode(inputText.value.toString())
        )
    }
}