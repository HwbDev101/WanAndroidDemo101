package com.hwb.wanandroiddemo101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
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


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId ==R.id.menuReset){
            number = 0
            textView.text="$number"
        }

        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Number",number)
    }
}