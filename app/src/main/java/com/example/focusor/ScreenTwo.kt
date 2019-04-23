package com.example.focusor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ScreenTwo : BaseActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, ScreenTwo::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_one)
        inflateFocusableView()

        val hideKeyboardButton = findViewById<Button>(R.id.navbutton)
        hideKeyboardButton.setOnClickListener { hideKeyboard() }
        val navButton = findViewById<Button>(R.id.navbutton)
        navButton.setOnClickListener { this.startActivity(ScreenOne.getIntent(this)) }
    }
}
