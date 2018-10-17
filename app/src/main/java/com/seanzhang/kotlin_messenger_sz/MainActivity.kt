package com.seanzhang.kotlin_messenger_sz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_register.setOnClickListener {
            val email = editText_email.text.toString()
            val password = editText_password.text.toString()

            Log.d("MainActivity", "Email: " + email)
            Log.d("MainActivity", "Password: $password")
        }

        textView_alreadh_have_account.setOnClickListener {
            Log.d("MainActivity", "onClickListener")

            // launch the login activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
