package com.example.karakolbazary.adabters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.karakolbazary.R
import com.example.karakolbazary.models.Categories
import kotlinx.android.synthetic.main.categories_items.view.*

class CategoriesAdapter(private  val categoriesList: List<Categories>, private val clickListener: OnCatClickListener):
    RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): CategoriesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.categories_items, parent, false)


        return  CategoriesViewHolder(itemView)
    }

    override fun getItemCount() = categoriesList.size

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val currentItem = categoriesList[position]

        holder.CatPhoto.setImageResource(currentItem.CatImage)
        holder.CatTitle.text = currentItem.CatTitle


        holder.initialize(clickListener)
    }

    class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val CatPhoto: ImageView = itemView.categories_image
        val CatTitle: TextView = itemView.categories_title

        fun initialize(action: OnCatClickListener){
            itemView.setOnClickListener{
                action.onCatClick(adapterPosition)
            }


        }
    }

    interface OnCatClickListener {
        fun onCatClick(position: Int)

    }
}
