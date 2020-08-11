package com.example.karakolbazary.ui.give_ad

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GiveAdViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is given ad Fragment"
    }
    val text: LiveData<String> = _text
}