package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    lateinit var tvName : TextView
    lateinit var tvLoction: TextView
    lateinit var tvNumber: TextView
    var UserName = " "
    var UserLoction = " "
    var UserNumber = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intent = getIntent()
        UserName = intent.getStringExtra("UserName").toString()
        UserLoction = intent.getStringExtra("UserLoction").toString()
        UserNumber = intent.getStringExtra("UserNumber").toString()

        tvName = findViewById<TextView>(R.id.tvName2)
        tvLoction = findViewById<TextView>(R.id.tvLoction2)
        tvNumber = findViewById<TextView>(R.id.tvNumber2)

        ShowData()

    }

    fun ShowData(){

        tvName.text = UserName
        tvLoction.text = UserLoction
        tvNumber.text = UserNumber
    }
}