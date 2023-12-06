package com.example.geolocation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // New activity
        // https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
        // https://stackoverflow.com/questions/44301301/android-how-to-achieve-setonclicklistener-in-kotlin
        // https://stackoverflow.com/questions/33022662/android-locationmanager-vs-google-play-services

        val button1 = findViewById<View>(R.id.btn_implementation1) as Button
        val button2 = findViewById<View>(R.id.btn_implementation2) as Button
        val button3 = findViewById<View>(R.id.btn_implementation3) as Button
        val button4 = findViewById<View>(R.id.btn_implementation4) as Button
        val button5 = findViewById<View>(R.id.btn_implementation5) as Button

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
                R.id.btn_implementation5 -> {
                    // Method 1 - to instantiate a fragment
                    // supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, LocationFragment5()).commit()

                    // Method 2 - using a wrapper function
                    navigateTo(LocationFragment5(), true)
                }
            }
        }

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
        button5.setOnClickListener(listener)
    }

    private fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, fragment)
        if (addToBackstack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }
}