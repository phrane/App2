package site.eyeberrry.app2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

enum class CalculatorMode {
    None,Add,Subtract,Multiply,Divide
}

class MainActivity : AppCompatActivity() {
    var lastButtonWasMode = false
    var currentMode = CalculatorMode.None
    var labelString = ""
    var saveNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCalculator()
    }

    fun setupCalculator() {

    }

    fun didPressEquals() {

    }

    fun didPressClear() {

    }

    fun updateText() {

    }

    fun changeMode(mode:CalculatorMode) {

    }

    fun didPressNumber(num:Int) {


    }
}
