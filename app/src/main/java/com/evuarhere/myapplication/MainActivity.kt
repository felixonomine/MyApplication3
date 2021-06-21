package com.evuarhere.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val userName = "admin"
    val passWord = "admin"

   private lateinit var  userNameInput:EditText
   private lateinit var passWordInput:EditText
   private lateinit var changeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}