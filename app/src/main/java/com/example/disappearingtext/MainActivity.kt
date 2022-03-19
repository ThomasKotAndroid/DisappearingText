package com.example.disappearingtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun convertLbs(view: View){
        if (lbsText.text.isNotEmpty()) {



            val poundsValue = lbsText.text.toString().toFloat()



            val kilogramValue = poundsValue * 0.45f



            textView.text = kilogramValue.toString()

        } else {

            textView.text = getString(R.string.no_value_string)

        }

    }
    }
