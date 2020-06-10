package com.example.threemanmafia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import java.lang.Exception

class SplashActivity : BaseActivity() {
    override fun setValues() {

    }

    override fun setupEvents() {

            Handler().postDelayed({ //delay를 위한 handler
                val myIntent = Intent(mContext, MainActivity::class.java)
                startActivity(myIntent)
                finish()
            }, 3000)


    }


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
    setupEvents()
    setValues()
}
}