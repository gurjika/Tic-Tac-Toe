package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar

private lateinit var firstPlayer:EditText
private lateinit var secondPlayer:EditText
private lateinit var start:Button
class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
        val hideName: ActionBar? = supportActionBar
        hideName?.hide()
        firstPlayer = findViewById(R.id.first)
        secondPlayer = findViewById(R.id.second)
        start = findViewById(R.id.button_1)
        start.setOnClickListener {
            if(firstPlayer.text.length == 0 || secondPlayer.text.length == 0){
                firstPlayer.error = "გთხოვთ შეიყვანოთ მოთამაშის სახელი"
            }
            else{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("First", firstPlayer.text.toString())
            intent.putExtra("Second", secondPlayer.text.toString())
            startActivity(intent)
            }
        }
    }


}