package com.amnah.bindingadaptertask2.model.bindingAdapter

import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["toast"])
fun setValueInToast(view: View,value:String?) {
    Toast.makeText(view.context, value, Toast.LENGTH_SHORT).show()
}