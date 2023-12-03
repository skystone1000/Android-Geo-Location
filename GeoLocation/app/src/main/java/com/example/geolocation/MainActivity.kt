package com.example.geolocation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // New activity
        // https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
        // https://stackoverflow.com/questions/44301301/android-how-to-achieve-setonclicklistener-in-kotlin

        val button1 = findViewById<View>(R.id.btn_implementation1) as Button
        val button2 = findViewById<View>(R.id.btn_implementation2) as Button
        val button3 = findViewById<View>(R.id.btn_implementation3) as Button
        val button4 = findViewById<View>(R.id.btn_implementation4) as Button

        val listener= View.OnClickListener { view ->
            when (view.id) {
                R.id.btn_implementation1 -> {
                    Toast.makeText(this,"Use *codelab-while-in-use-location* app", Toast.LENGTH_SHORT).show()
                }
                R.id.btn_implementation2 -> {
                    val intent = Intent(this, LocationActivity2::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation3 -> {
                    val intent = Intent(this, LocationActivity3::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation4 -> {
                    val intent = Intent(this, LocationActivity4::class.java)
                    startActivity(intent)
                }
            }
        }

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)

    }
}