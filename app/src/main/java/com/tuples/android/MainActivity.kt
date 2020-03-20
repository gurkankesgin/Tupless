package com.tuples.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tuples.tupless.Quadruple
import com.tuples.tupless.Quintuple
import com.tuples.tupless.Septuple

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quadruple = getQuadruple()
        val septuple = getSepTuple()
    }

    fun getQuadruple(): Quadruple<String, Boolean, Int, Long> {
        return Quadruple("name", true, 0, 0L)
    }

    fun getSepTuple(): Septuple<String, Boolean, Int, Long, Int, Int, Int> {
        return Septuple("name", true, 0, 0L, 0, 0,0)
    }
}