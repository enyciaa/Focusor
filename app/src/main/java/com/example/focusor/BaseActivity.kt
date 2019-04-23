package com.example.focusor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun inflateFocusableView() {
        val view = View(this)
        view.layoutParams = ViewGroup.LayoutParams(1, 1)
        view.isFocusable = true
        view.isFocusableInTouchMode = true
        val parent = findViewById<ViewGroup>(android.R.id.content)
        parent.addView(view, 0)
    }
}
