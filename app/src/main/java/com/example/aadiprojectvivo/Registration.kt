package com.example.aadiprojectvivo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        supportActionBar?.hide()

        tvcon_list.setOnClickListener {
            val intent=Intent(this@Registration,Country::class.java)
            startActivity(intent)
        }

    }
}