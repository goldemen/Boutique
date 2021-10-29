package com.epsi.boutique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.layoutManager=LinearLayoutManager(this)

        val itemsViewModel = ArrayList<ItemsViewModel>()

        //Liste des objets
        itemsViewModel.add(ItemsViewModel(R.drawable.montre, "oui"))
        itemsViewModel.add(ItemsViewModel(R.drawable.testmontre1, "2"))

        val adapter = CustomAdapter(itemsViewModel)

        recyclerview.adapter=adapter
    }
}
