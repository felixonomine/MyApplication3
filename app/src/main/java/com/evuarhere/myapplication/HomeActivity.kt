package com.evuarhere.myapplication

import android.content.Intent
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var userNameDisplay: TextView
private lateinit var profileHome:Button


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeLandingPage = 0
        userNameDisplay = findViewById(homeLandingPage)
        userNameDisplay.text = getStringExtra("username")

        profileHome =findViewById()
        val name = ""
        profileHome.text ="welcome, ${intent.getStringExtra(name: "username")}"

        profileHome.setOnClickListener { openProfilePage() }

    }

    private fun getStringExtra(s: String): CharSequence? {

    }

    private  fun openProfilePage(){
        val packageContext = intent
        val  intent =intent(packageContext:this,profileActivity::class.java)
        startActivity(intent)

    }

    private fun intent(packageContext: Intent?): Intent? {
        TODO("Not yet implemented")
    }
}