package com.example.akshay.demoapp1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    val TAG:String = "Main Activity called"
    lateinit var btn_nextactivity: Button
  //  var data: Data = Data(fname, lname)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "in method onCreate")

        var data = Data("akshay","parmar")


        btn_nextactivity = findViewById(R.id.button_)

        btn_nextactivity.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                //Explicit Intent

//              Toast.makeText(this@MainActivity, "Button clicked",Toast.LENGTH_LONG).show()
//              var intent:Intent = Intent(this@MainActivity, SecondActivity::class.java)
//              startActivity(intent)


                //Implicit Intent

                Log.e("Welcome to Data","Value is : ${data}" )
                var intent: Intent = Intent()
                intent.action = "com.sample.intent"
                intent.addCategory(Intent.CATEGORY_DEFAULT)

//              intent.putExtra("Mykey","First Activity message called")

                //Implicit Intent with  passing data class object
                intent.putExtra("Key1", data)
                startActivity(intent)
            }

        })


    }



}
