package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Fibonaccicount(var num:List<Int>):RecyclerView.Adapter<NumberHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_nums , parent,false)
        return NumberHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberHolder, position: Int) {
//        holder.numbers.text = num[position]
        holder.numbers.text = num[position].toString()

    }

    override fun getItemCount(): Int {
        return num.size

    }
}
class NumberHolder(itemView: View):ViewHolder(itemView){
    var numbers = itemView.findViewById<TextView>(R.id.tvnumbers)


}