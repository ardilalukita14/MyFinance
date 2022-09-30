package com.example.managefinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.managefinance.activity.LoginActivity
import com.example.managefinance.activity.RegisterActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mhandler = Handler()

        mhandler.postDelayed(
            {
                val pindah = Intent(this, LoginActivity::class.java)
                startActivity(pindah)
                finish()
            },2000
        )

    }
}