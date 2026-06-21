package com.flare.compiler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // Using AppCompatActivity for Material Components theme compatibility
// import android.widget.TextView // No longer needed as we're using an XML layout
// import android.widget.Button // Not strictly needed unless adding a click listener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to our new XML layout
        setContentView(R.layout.activity_main)

        // If you needed to interact with the button later, you would do:
        // val flareTradeButton: Button = findViewById(R.id.flareTradeButton)
        // flareTradeButton.setOnClickListener { 
        //     // Handle button click logic here
        // }
    }
}
