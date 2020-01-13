package com.example.e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            calculate()
        }
    }

    fun calculate() {
        val ageId = spinnerAge.selectedItemPosition.toString().toInt()
        val gender = findViewById<RadioButton>(radioGroupGender.checkedRadioButtonId).text
        val smoker = checkBoxSmoker.isChecked
        var premium = 0

        when (ageId) {
            1 -> premium += 60
            2 -> premium += 70
            3 -> premium += 90
            4 -> premium += 120
            5 -> premium += 150
            6 -> premium += 150
        }
    }
}
