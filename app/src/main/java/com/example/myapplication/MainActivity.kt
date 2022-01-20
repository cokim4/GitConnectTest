package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokelist : Button = findViewById(R.id.mainbtn1)
        val chara : Button = findViewById(R.id.mainbtn3)
        val egg : Button = findViewById(R.id.mainbtn4)

        pokelist.setOnClickListener{
            val intent = Intent(this, PokeList::class.java)
            startActivity(intent)
        }

        chara.setOnClickListener{
            val intent = Intent(this, Characteristic::class.java)
            startActivity(intent)
        }

        egg.setOnClickListener{
            val intent = Intent(this, Egggroup::class.java)
            startActivity(intent)
        }

    }
}