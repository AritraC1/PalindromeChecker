package com.programming.palindromechecker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textField: EditText
    private lateinit var checkButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textField = findViewById(R.id.text_input)
        checkButton = findViewById(R.id.check_btn)

        // setting up button click listener
        checkButton.setOnClickListener{
            val text = textField.text.toString().lowercase()

            if (text.isEmpty()) {
                // Show Toast message for empty text
                Toast.makeText(
                    this,
                    "Enter a word",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                checkPalindrome(text)
            }
        }
    }

    private fun checkPalindrome(text: String) {
        val revText = text.reversed()

        if (text == revText) {
            Toast.makeText(
                this,
                "Entered word is a Palindrome",
                Toast.LENGTH_SHORT
            ).show()
        }
        else {
            Toast.makeText(
                this,
                "Entered word is not a Palindrome",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}