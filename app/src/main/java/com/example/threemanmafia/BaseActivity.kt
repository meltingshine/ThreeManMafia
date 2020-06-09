package com.example.threemanmafia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this
    abstract fun setValues()
    abstract fun setupEvents()

}