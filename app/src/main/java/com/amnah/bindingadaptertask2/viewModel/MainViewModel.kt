package com.amnah.bindingadaptertask2.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.amnah.bindingadaptertask2.model.repositiry.MainRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    private val repository = MainRepository()

    private val data = repository.languages.languageName

    val languagesName = flow {
        data.forEach {
            emit(it.lang)
            delay(2000)
        }
    }.asLiveData()
}