package dev.bakhita.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.bakhita.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()
    }

    fun displayNumbers() {
        var numbersList = listOf(series(100))
        val numbersAdapter = NumbersRecyclerViewAdapter(numbersList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numbersAdapter
        print(numbersList)
    }
    fun series(numberseries: Int): List<Int> {
    var list = ArrayList<Int>()
    var num1 = 0
    var num2 = 1
    var sum = 0
    while (sum <= numberseries) {
        print("$num1")
        val next = num1 + num2
        num1 = num2
        num2 = next
        sum++
        list += next
    }
    return list
}


}

