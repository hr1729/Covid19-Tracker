package com.example.covid19tracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.confirmedTv
import kotlinx.android.synthetic.main.activity_main.view.recoveredTv
import kotlinx.android.synthetic.main.listofimtem.view.*

class todoadapter(val context: Context,val list:List<StatewiseItem>):RecyclerView.Adapter<todoadapter.ViewHolder>() {
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val clo_1=view.confirmedTv
        val col_2=view.recoveredTv
        val col_3=view.deceasedTv1
        val col_4=view.activeTv1
        val col_5=view.stateTv

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.listofimtem,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val op=list[position]
        holder.clo_1.text=op.confirmed
        holder.col_2.text=op.recovered
        holder.col_3.text=op.deaths
        holder.col_4.text=op.active
        holder.col_5.text=op.state

    }
    override fun getItemCount(): Int {
        return list.size
    }
}