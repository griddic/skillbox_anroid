package com.griddic.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MyApp"

fun sayMePressed(view: android.view.View) {
    val button: Button = view as Button
    val buttonText =  button.text
    Log.i(TAG, "$buttonText has been pressed.")
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_first).setOnClickListener { button -> sayMePressed(button) }
        findViewById<Button>(R.id.button_second).setOnClickListener { button -> sayMePressed(button) }
        findViewById<Button>(R.id.button_third).setOnClickListener { button -> sayMePressed(button) }
    }
}