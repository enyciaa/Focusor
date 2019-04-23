package com.example.focusor

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun Activity.hideKeyboard() {
    currentFocus?.hideKeyboard()
}
fun View.hideKeyboard() {
    this.clearFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, InputMethodManager.HIDE_NOT_ALWAYS or InputMethodManager.RESULT_UNCHANGED_SHOWN)
}