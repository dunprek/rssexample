package com.don.rssexample.base

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by gideon on 28,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

abstract class BaseActivity : AppCompatActivity (){

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}