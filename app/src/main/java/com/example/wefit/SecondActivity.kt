package com.example.wefit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.wefit.Exercises


class SecondActivity : AppCompatActivity() {
    lateinit var labelHeader: TextView
    lateinit var buttonbmi: Button
    lateinit var buttonwo: Button
    lateinit var buttonlog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        labelHeader = findViewById(R.id.txt_results)
        buttonbmi = findViewById(R.id.btn_bmi)
        buttonwo = findViewById(R.id.btn_workout)
        buttonlog = findViewById(R.id.btn_log)

        var result = intent.getStringExtra("result")
        labelHeader.text = "Hello, $result!"

        buttonbmi.setOnClickListener {
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }

        buttonwo.setOnClickListener {
            val intent = Intent(this, Exercises::class.java)
            startActivity(intent)
        }
        buttonlog.setOnClickListener{
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }
    }
}

