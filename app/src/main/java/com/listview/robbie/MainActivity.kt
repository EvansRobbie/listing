package com.listview.robbie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var array = arrayOf("Apples","Apricots","Bananas","Oranges","Mangoes",
    "Watermelons","Kiwis","Grapes","Pawpaws")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create an array adaptger to bring list_item and your array item together
        val adapter = ArrayAdapter(this,
        R.layout.listview_item, array)

        val listView = findViewById(R.id.listview_1) as ListView
        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val itemValue = listView.getItemAtPosition(p2) as String
                Toast.makeText(applicationContext,"you Pick $itemValue",
                Toast.LENGTH_LONG).show()

                // create a new page/activity
                //right click on app, new activity  - empty
                // we link the new page/ activity
                //intents(link)
                // 2 types
                 // 1. explicit - link within an app
                //2. Implicit - link outside your app - website,
                // we do explicit intent to HospitalDisplay
                // add the back arrow on the manifest.xml below the .HospitalDisplay
                val intent = Intent(applicationContext, HospitalDisplay::class.java)
                //as we go to hospital display,carry the position
                //p2 carries position of clicked item
                intent.putExtra("position",p2)
                startActivity(intent)
            }
        }
        //don
    }// end function

} // end class