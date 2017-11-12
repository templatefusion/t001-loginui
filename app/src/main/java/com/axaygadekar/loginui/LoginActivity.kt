package com.axaygadekar.loginui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set view
        setContentView(R.layout.activity_login)

        // signup text click
        val signup = findViewById<TextView>(R.id.signup_text)
        signup.setOnClickListener { startActivity(Intent(this@LoginActivity, SignupActivity::class.java)) }

    }
}
