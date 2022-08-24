package com.example.mycustomlistv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)

        val list = mutableListOf<Model>()

        //adding images
        list.add(Model("Aeroplane", "Your best plane ever.", R.drawable.plains))
        list.add(Model("Whatsapp", "whatsapp was to communicate.", R.drawable.whatsapp))
        list.add(Model("Youtube", "youtube was to entertain.", R.drawable.youtube))
        list.add(Model("Instagram", "instagram was to socialize.", R.drawable.instargram))
        list.add(Model("Twitter", "twitter was to socialize.", R.drawable.twitter))
        list.add(Model("Bets", "Betting and gabling.", R.drawable.bets))
        listView.adapter = myAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->



        if (position == 0) {
            Toast.makeText(this@MainActivity, "You have clicked on Facebook!", Toast.LENGTH_LONG)
                .show()
        }
        if (position == 1) {
            Toast.makeText(this@MainActivity, "You have clicked on Whatsapp!", Toast.LENGTH_LONG)
                .show()
        }
        if (position == 2) {
            Toast.makeText(this@MainActivity, "You have clicked on Youtube!", Toast.LENGTH_LONG)
                .show()
        }
        if (position == 3) {
            Toast.makeText(this@MainActivity, "You have clicked on Instagram!", Toast.LENGTH_LONG)
                .show()
        }
        if (position == 4) {
            Toast.makeText(this@MainActivity, "You have clicked on Twitter!", Toast.LENGTH_LONG)
                .show()
        }
            if (position == 5) {
                Toast.makeText(this@MainActivity, "You have clicked on bets!", Toast.LENGTH_LONG)
                    .show()
            }
       }
    }
}