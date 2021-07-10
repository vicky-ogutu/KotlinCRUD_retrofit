package com.example.kotlinretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyAdapter: RecyclerView.Adapter<RecyAdapter.myViewHolder>() {

 var posts_list = mutableListOf<Posts>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyAdapter.myViewHolder{

        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.postlist_layout, parent, false);

        return myViewHolder(inflater);
    }

    override fun onBindViewHolder(holder: RecyAdapter.myViewHolder, position: Int) {
        holder.bind(posts_list[position])

    }

    override fun getItemCount(): Int {
        return posts_list.size
    }

    class myViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val textTitle = view.findViewById<TextView>(R.id.body);
        val textBody = view.findViewById<TextView>(R.id.title);


        fun bind(data: Posts){

            textTitle.text = data.title
            textBody.text = data.body

        }

    }



}