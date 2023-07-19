package com.azimzada.chatapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimzada.chatapp.R
import com.azimzada.chatapp.model.ChatroomsDTO

class ChaatroomsAdapter(var list: List<ChatroomsDTO>) : RecyclerView.Adapter<ChaatroomsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageBg = itemView.findViewById<ImageView>(R.id.rvBG)
        var textview = itemView.findViewById<TextView>(R.id.chatroomsText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChaatroomsAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChaatroomsAdapter.ViewHolder, position: Int) {
        holder.imageBg.setImageResource(list.get(position).image)
        holder.textview.setText(list.get(position).text)

    }
}