package com.example.aadiprojectvivo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val intent=Intent(this@LoginActivity,HomeActivity::class.java)
            startActivity(intent)
        }

        tv_fp.setOnClickListener {
            val intent=Intent(this@LoginActivity,ForgotPass::class.java)
            startActivity(intent)
        }
        tv_ca.setOnClickListener {
            val intent=Intent(this@LoginActivity,Registration::class.java)
            startActivity(intent)
        }
    }
}