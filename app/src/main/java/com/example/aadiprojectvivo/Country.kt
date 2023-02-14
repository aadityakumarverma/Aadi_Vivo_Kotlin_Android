package com.example.aadiprojectvivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_country.*

class Country : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)



        val country= arrayOf("India",
            "Denmark",
            "Germany",
            "Sweden",
            "United Kingdom",
            "Spain",
            "USA",
            "Belgium",
            "France",
            "Norway",
            "Russia",
            "Poland",
            "Austria",
            "Albania");

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,country)
        lvCountry.adapter=arrayAdapter

        lvCountry.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }

    }

}
