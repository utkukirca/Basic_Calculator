package com.utkukirca.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.utkukirca.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var numberInputOne : Float? = null
    var numberInputTwo : Float? = null
    var result : Float? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun sumNumbers(view : View) {

        numberInputOne = binding.inputNumberOne.text.toString().toFloatOrNull()
        numberInputTwo = binding.inputNumberTwo.text.toString().toFloatOrNull()

        if(numberInputOne == null || numberInputTwo == null){
            binding.resultText.text = "Error ! "
        }
        else
        {
            result = numberInputOne!! + numberInputTwo!!

            binding.resultText.text = "Result: ${result}"
        }

    }

    fun subNumbers(view: View){
        numberInputOne = binding.inputNumberOne.text.toString().toFloatOrNull()
        numberInputTwo = binding.inputNumberTwo.text.toString().toFloatOrNull()

        if(numberInputOne == null || numberInputTwo == null){
            binding.resultText.text = "Error ! "
        }
        else
        {
            result = numberInputOne!! - numberInputTwo!!

            binding.resultText.text = "Result: ${result}"
        }
    }

    fun multiplyNumbers(view: View){
        numberInputOne = binding.inputNumberOne.text.toString().toFloatOrNull()
        numberInputTwo = binding.inputNumberTwo.text.toString().toFloatOrNull()

        if(numberInputOne == null || numberInputTwo == null){
            binding.resultText.text = "Error ! "
        }
        else
        {
            result = numberInputOne!! * numberInputTwo!!

            binding.resultText.text = "Result: ${result}"
        }
    }

    fun divideNumbers(view: View) {
        numberInputOne = binding.inputNumberOne.text.toString().toFloatOrNull()
        numberInputTwo = binding.inputNumberTwo.text.toString().toFloatOrNull()

        if(numberInputOne == null || numberInputTwo == null){
            binding.resultText.text = "Error ! "
        }
        else
        {
            result = numberInputOne!! / numberInputTwo!!

            binding.resultText.text = "Result: ${result}"
        }
    }

    fun clearAll(view: View){
        binding.inputNumberOne.text.clear()
        binding.inputNumberTwo.text.clear()
        binding.resultText.text = ""

    }

}