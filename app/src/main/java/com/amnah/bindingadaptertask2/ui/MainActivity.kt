package com.amnah.bindingadaptertask2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.amnah.bindingadaptertask2.R
import com.amnah.bindingadaptertask2.databinding.ActivityMainBinding
import com.amnah.bindingadaptertask2.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding

    private val _viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        _binding.viewModel = _viewModel
        _binding.lifecycleOwner = this
    }
}