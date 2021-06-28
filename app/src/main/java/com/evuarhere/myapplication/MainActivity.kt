package com.evuarhere.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication


class MainActivity : AppCompatActivity() {
    val userName = "admin"
    val passWord = "admin"

    private lateinit var userNameInput: EditText
    private lateinit var passWordInput: EditText
    private lateinit var changeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput = findViewById(R.id.userNameInput)
        passWordInput = findViewById(R.id.passWordInput)
        changeButton = findViewById(R.id.changeButton)

        changeButton.setOnClickListener {
            val userName = userNameInput.toString()
            val passWord = passWordInput.text.toString()

            login(userName, passWord)

        }
    }

    fun login(userName: String, password: String) {

        if ('isValidCredentials(userName', password)) run {


            val intent: Intent = intent(this, HomeActivity::class.java)
            intent, putExtra("username", userName)
            startActivity(intent)

        } else {
            Toast. makeText((applicationContext, "login not successful", Toast.LENGTH_SHORT)){

            }

    }
        private fun isValidCredentials(userName: String,password: String): Boolean {
            return if (userName:validUserName && password:String == validPassword){
                return
            }else false

            }
            }

