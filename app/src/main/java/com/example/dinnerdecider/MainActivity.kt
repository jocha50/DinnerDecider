package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var defaultFoods: ArrayList<String> = ArrayList<String>(Arrays.asList("Hamburger","Pizza","Mexican","American","Chinese"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decide(view : View){

        var size = defaultFoods.size
        var index:Int = Math.floor(Math.random() * size).toInt()

        textView2.setText("${defaultFoods.get(index)}")
        println(index)

    }

    fun addFood(view: View)
    {
        var text: String = editText.text.toString()
        println(text)
        defaultFoods.add(text)
        textView2.setText(text)
        editText.setText("")

    }
}