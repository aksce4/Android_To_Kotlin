package com.example.akshay.demoapp1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.akshay.demoapp1.R.id.text_person
import kotlinx.android.synthetic.main.activity_second_main.*

class SecondActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main)

//        var msg: String = intent.getStringExtra("Mykey")
//        text_msg.text = msg


        var data = intent.getSerializableExtra("Key1") as? Data
        text_person.text = data.toString()



        button_back.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var intent2: Intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent2)

            }

        })
    }


}