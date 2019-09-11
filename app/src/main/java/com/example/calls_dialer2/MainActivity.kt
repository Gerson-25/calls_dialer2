package com.example.calls_dialer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var loadingContainer:View? = null
    var textBox:TextView?=null
    var callBtn: Button? = null
    var btn1: Button? = null
    var btn2: Button? = null
    var btn3: Button? = null
    var btn4: Button? = null
    var btn5: Button? = null
    var btn6: Button? = null
    var btn7: Button? = null
    var btn8: Button? = null
    var btn9: Button? = null
    var btn0: Button? = null
    var btnDelete: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        callBtn = findViewById(R.id.buttonLlamar)
        btn0 = findViewById(R.id.button0)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn9 = findViewById(R.id.button9)
        textBox = findViewById(R.id.textBox)
        btnDelete = findViewById(R.id.buttonC)
        loadingContainer = findViewById(R.id.loadingContainer)
        loadingContainer!!.setOnClickListener { showLoading(true) }
        callBtn!!.setOnClickListener { showLoading(false) }
        btn1!!.setOnClickListener { textBox!!.text = "${textBox!!.text}1"}
        btn2!!.setOnClickListener { textBox!!.text = "${textBox!!.text}2"}
        btn3!!.setOnClickListener { textBox!!.text = "${textBox!!.text}3"}
        btn4!!.setOnClickListener { textBox!!.text = "${textBox!!.text}4"}
        btn5!!.setOnClickListener { textBox!!.text = "${textBox!!.text}5"}
        btn6!!.setOnClickListener { textBox!!.text = "${textBox!!.text}6"}
        btn7!!.setOnClickListener { textBox!!.text = "${textBox!!.text}7"}
        btn8!!.setOnClickListener { textBox!!.text = "${textBox!!.text}8"}
        btn9!!.setOnClickListener { textBox!!.text = "${textBox!!.text}9"}
        btn0!!.setOnClickListener { textBox!!.text = "${textBox!!.text}0"}


    }

    fun showLoading(show: Boolean) {
        val visibility = if(!show) View.VISIBLE else View.GONE
        loadingContainer!!.visibility = visibility
    }

}
