package com.example.karakolbazary.adabters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.karakolbazary.R
import com.example.karakolbazary.models.AllAds
import com.facebook.drawee.view.SimpleDraweeView
import kotlinx.android.synthetic.main.all_ads_items.view.*

class AllAdAdapter(private  val allAdList: List<AllAds> , val clickListener: OnAllAdClickListener):
    RecyclerView.Adapter<AllAdAdapter.AllAdViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): AllAdViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.all_ads_items, parent, false)


        return  AllAdViewHolder(itemView)
    }

    override fun getItemCount() = allAdList.size

    override fun onBindViewHolder(holder: AllAdViewHolder, position: Int) {
        val currentItem = allAdList[position]

        holder.AllAdPhoto.setImageResource(currentItem.AllAdImage)
        holder.AllAdTitle.text = currentItem.AllAdTitle
        holder.AllAdPrice.text = currentItem.AllAdPrice
        holder.AllAdDate.text = currentItem.AllAdDate

        holder.initialize(clickListener)
    }

    class AllAdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val AllAdPhoto: SimpleDraweeView = itemView.AllAdImage
        val AllAdTitle: TextView = itemView.AllAdTitle
        val AllAdPrice: TextView = itemView.AllAdPrice
        val AllAdDate: TextView = itemView.AllAdDate

        fun initialize(action: OnAllAdClickListener){
            itemView.setOnClickListener{
                action.onAllAdClick(adapterPosition)
            }


        }
    }

    interface OnAllAdClickListener {
        fun onAllAdClick(position: Int)

    }
}