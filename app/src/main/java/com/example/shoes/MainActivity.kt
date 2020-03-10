package com.example.shoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoes.adapter.PersonAdapter
import com.example.shoes.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personArray =ArrayList<Person>()
        personArray.add(Person("001",R.drawable.shoe1,"Nike Superfly","Elite","$9999","002",R.drawable.shoe2,"Nike Air","football shoe","$5555"))
        personArray.add(Person("003",R.drawable.shoe3,"Air Jordan 14","Sport","$9999","004",R.drawable.shoe5,"Low EP","football shoe","$5555"))
        personArray.add(Person("005",R.drawable.shoe4,"Jordan Spport","Zero","$9999","006",R.drawable.shoe6,"Lebron XI","football shoe","$5555"))


        var personAddapter = PersonAdapter(personArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = personAddapter


    }
}
