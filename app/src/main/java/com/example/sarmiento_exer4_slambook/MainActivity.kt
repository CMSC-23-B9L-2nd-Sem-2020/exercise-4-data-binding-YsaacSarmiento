package com.example.sarmiento_exer4_slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.sarmiento_exer4_slambook.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            onClick()
            binding.name = findViewById<TextView>(R.id.editText).text.toString()
            binding.nickname = findViewById<TextView>(R.id.editText2).text.toString()
            binding.age = findViewById<TextView>(R.id.editText3).text.toString()
        }
    }
    fun onClick(){
        findViewById<TextView>(R.id.ViewAge4).visibility = View.VISIBLE
        findViewById<TextView>(R.id.viewName2).visibility = View.VISIBLE
        findViewById<TextView>(R.id.viewNickname2).visibility = View.VISIBLE
        findViewById<TextView>(R.id.t).visibility = View.VISIBLE
        findViewById<TextView>(R.id.editText4).visibility = View.GONE
        findViewById<TextView>(R.id.editText2).visibility = View.GONE
        findViewById<TextView>(R.id.editText3).visibility = View.GONE
        findViewById<TextView>(R.id.editText6).visibility = View.GONE
        findViewById<TextView>(R.id.editText7).visibility = View.GONE
        findViewById<TextView>(R.id.editText8).visibility = View.GONE
        findViewById<TextView>(R.id.editText).visibility = View.GONE
        findViewById<TextView>(R.id.editText10).visibility = View.GONE
        findViewById<TextView>(R.id.editText12).visibility = View.GONE
        findViewById<TextView>(R.id.editText13).visibility = View.GONE
        findViewById<TextView>(R.id.viewName).visibility = View.GONE
        findViewById<TextView>(R.id.viewAge).visibility = View.GONE
        findViewById<TextView>(R.id.viewBday).visibility = View.GONE
        findViewById<TextView>(R.id.viewCourse).visibility = View.GONE
        findViewById<TextView>(R.id.viewNickName).visibility = View.GONE
        findViewById<TextView>(R.id.textView6).visibility = View.GONE
        findViewById<TextView>(R.id.textView7).visibility = View.GONE
        findViewById<TextView>(R.id.textView8).visibility = View.GONE
        findViewById<TextView>(R.id.textView9).visibility = View.GONE
        findViewById<TextView>(R.id.textView).visibility = View.GONE
        findViewById<TextView>(R.id.textView10).visibility = View.GONE
        findViewById<Button>(R.id.button).visibility = View.GONE


    }
}
