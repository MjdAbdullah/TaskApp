/*

* */


package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var etName : EditText
    lateinit var etLoction : EditText
    lateinit var etNumber : EditText
    lateinit var tvName: TextView
    lateinit var tvLoction: TextView
    lateinit var tvNumber: TextView
    lateinit var bGo : Button
    lateinit var bTog : Button
    lateinit var bTV : Button
    lateinit var tvName2 : TextView
    lateinit var tvNumber2 : TextView
    lateinit var tvLoction2 : TextView
    lateinit var clMain : ConstraintLayout
    var userName = "NULL"
    var userLoction = "NULL"
    var userNumber = "NULL"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById<EditText>(R.id.etName)
        etLoction = findViewById<EditText>(R.id.etLoction)
        etNumber = findViewById<EditText>(R.id.etNumber)
        tvName = findViewById<TextView>(R.id.tvName)
        tvLoction = findViewById<TextView>(R.id.tvLoction)
        tvNumber = findViewById<TextView>(R.id.tvNumber)
        bGo = findViewById<Button>(R.id.buttonGo)
        bTog = findViewById<Button>(R.id.buttonTOG)
        bTV = findViewById<Button>(R.id.buttonTV)
        clMain = findViewById<ConstraintLayout>(R.id.clMain)
        bTV.setOnClickListener { PrintInTV() }
        bTog.setOnClickListener { PrintInTost() }
        bGo.setOnClickListener { openPage2() }

    }

    fun PrintInTV(){
        getValueUser()
        tvName.text = userName
        tvLoction.text = userLoction
        tvNumber.text = userNumber
    }

    fun PrintInTost(){
        getValueUser()
        var p = userName+" "+userLoction+" "+userNumber
        Toast.makeText(applicationContext, p, Toast.LENGTH_LONG).show()
    }

    fun getValueUser(){
        userName = etName.getText().toString()
        userLoction = etLoction.getText().toString()
        userNumber = etNumber.getText().toString()
    }
    fun openPage2() {
        getValueUser()
        var intent = Intent(this , Activity2::class.java)
        intent.putExtra("UserName",userName)
        intent.putExtra("UserLoction",userLoction)
        intent.putExtra("UserNumber",userNumber)
        startActivity(intent)
    }

}