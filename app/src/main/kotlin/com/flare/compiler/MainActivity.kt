package com.flare.compiler

import android.os.Bundle
import android.app.Activity
import android.widget.TextView
import android.widget.Button
import android.widget.LinearLayout
import android.view.ViewGroup
import android.widget.LinearLayout.LayoutParams

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)

        val textView = TextView(this)
        textView.text = "Hello World from FlareBuilder Kotlin IDE!"
        linearLayout.addView(textView)

        val deleteButton = Button(this)
        deleteButton.text = "Удалить"
        linearLayout.addView(deleteButton)

        setContentView(linearLayout)
    }
}