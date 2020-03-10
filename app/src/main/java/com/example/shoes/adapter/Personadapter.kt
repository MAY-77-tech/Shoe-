package com.example.shoes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoes.R
import com.example.shoes.model.Person
import kotlinx.android.synthetic.main.item_person.view.*


class PersonAdapter(var personList: ArrayList<Person>): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonAdapter.PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])
    }

    inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Person) {

           itemView.textone.text = person.textone
            itemView.imageone.setImageResource(R.drawable.shoe1)
            itemView.texttwo.text = person.texttwo
            itemView.textthree.text = person.textthree
            itemView.textfour.text = person.textfour

            itemView.textones.text = person.textones
            itemView.imagetwo.setImageResource(R.drawable.shoe2)
            itemView.texttwos.text = person.texttwos
            itemView.textthrees.text = person.textthrees
            itemView.textfours.text = person.textfours

        }
    }
}
