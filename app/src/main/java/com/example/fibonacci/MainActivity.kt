package com.example.fibonacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        var names = addNumbers(100)
        binding.rvnumber.layoutManager = GridLayoutManager(this,3)
        var nums = Fibonaccicount(names)
        binding.rvnumber.adapter = nums

    }
    fun addNumbers(numb:Int):List<Int>{
        var names = mutableListOf(0,1)
        while (names.size<numb){
            names.add(names[names.lastIndex]+ names[names.lastIndex -1])
        }
        return names

    }
}