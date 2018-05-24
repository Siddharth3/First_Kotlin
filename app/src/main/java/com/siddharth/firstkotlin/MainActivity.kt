package com.siddharth.firstkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for setting text by using kotlin extension in gradle
        textView_heading.text=getString(R.string.app_name)
        button_show.text=getString(R.string.show)
        button_nextactivity.text=getString(R.string.go_to_second_screen)

        // define button
        val button_show = findViewById(R.id.button_show) as Button
        val button_nextactivity = findViewById(R.id.button_nextactivity) as Button

        // button click listner
        button_show.setOnClickListener {

            // toast
            Toast.makeText(this, R.string.kotlin_toast, Toast.LENGTH_LONG).show()
        }

        button_nextactivity.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            // To pass any data to next activity
            intent.putExtra(getString(R.string.second_activity_text), getString(R.string.second_activity))
            // start your next activity
            startActivity(intent)
        }
    }
}
