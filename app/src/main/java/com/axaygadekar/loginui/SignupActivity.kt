package com.axaygadekar.loginui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

/**
 * @author axay gadekar
 * @version v1.0
 */
class SignupActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set view
        setContentView(R.layout.activity_signup)

        // login text click
        val login = findViewById<TextView>(R.id.login_text)
        login.setOnClickListener { startActivity(Intent(this@SignupActivity, LoginActivity::class.java)) }

    }

}
