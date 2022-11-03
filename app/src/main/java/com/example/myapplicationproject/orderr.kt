package com.example.myapplicationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class orderr : AppCompatActivity() {
    lateinit var buttonMpesa: Button
    lateinit var buttonhome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderr)
        buttonMpesa = findViewById(R.id.mBtnMpesa)
        buttonhome = findViewById(R.id.button)

        buttonhome.setOnClickListener {
            startActivity(Intent(this, homeac::class.java))
        }

        buttonMpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

        }
    }
}




