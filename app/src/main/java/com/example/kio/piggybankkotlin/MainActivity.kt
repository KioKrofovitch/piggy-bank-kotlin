package com.example.kio.piggybankkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var piggyBank: PiggyBank = PiggyBank()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_quarter.setOnClickListener {piggyBank.addQuarter()}
        button_dime.setOnClickListener {piggyBank.addDime()}
        button_nickel.setOnClickListener { piggyBank.addNickel() }
        button_penny.setOnClickListener { piggyBank.addPenny() }

        text_running_total.setText(piggyBank.getRunningTotal().toString())
    }

}
