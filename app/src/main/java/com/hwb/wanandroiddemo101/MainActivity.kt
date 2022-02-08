package com.hwb.wanandroiddemo101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number = savedInstanceState?.getInt("Number")?:0
        textView.text = "$number"
        buttonAdd.setOnClickListener { textView.text = "${++number}" }
        buttonSub.setOnClickListener { textView.text = "${--number}" }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Number",number)
    }
}