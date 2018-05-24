package com.siddharth.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textFromFirstActivity: String = intent.getStringExtra(getString(R.string.second_activity_text))

        textView_title.text= textFromFirstActivity
    }
}
