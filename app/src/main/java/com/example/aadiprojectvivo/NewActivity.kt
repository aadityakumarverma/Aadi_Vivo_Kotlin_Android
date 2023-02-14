package com.example.aadiprojectvivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_country.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)

//        val listView=findViewById<ListView>(R.id.lvCountry);

        val country= arrayOf("Contact name",
            "Company name",
            "Activity type",
            "Due date",
            "Activity note");

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,country)
        lvCountry.adapter=arrayAdapter

        lvCountry.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }

    }

}
/*
"Contact name",
"Company name",
"Activity type",
"Due date",
"Activity note"
*/
