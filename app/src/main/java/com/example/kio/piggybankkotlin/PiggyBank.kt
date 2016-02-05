package com.example.kio.piggybankkotlin

/**
 * Piggy Bank Data Model
 */

class PiggyBank {

    // TODO: KIO Blog post
    // Do I need private? Do I need to initialize?
    // What's the advantage of lateinit? Also what is synthetic Properties?
    private var numQuarters: Int = 0
    private var numDimes: Int = 0
    private var numNickels: Int = 0
    private var numPennies: Int = 0

    var runningTotal: Double = 0.0

    fun addQuarter() {
        numQuarters += 1
        updateRunningTotal()
    }

    fun addDime() {
        numDimes += 1
        updateRunningTotal()
    }

    fun addNickel() {
        numNickels += 1
        updateRunningTotal()
    }

    fun addPenny() {
        numPennies += 1
        updateRunningTotal()
    }

    fun updateRunningTotal() {
        runningTotal = (numQuarters*25 + numDimes*10 + numNickels*5 + numPennies)/100.00
    }
}