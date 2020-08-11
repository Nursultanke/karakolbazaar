package com.example.karakolbazary.ui.detail

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.karakolbazary.R
import com.example.karakolbazary.adabters.CategoriesAdapter
import com.example.karakolbazary.models.Categories
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import kotlinx.android.synthetic.main.fragment_all.*

class DetailInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_info)

        fabInit()
    }

    @SuppressLint("MissingPermission")
    private fun fabInit(){

        val fabDetail: ExtendedFloatingActionButton = findViewById(R.id.fab_detail)
        fabDetail.setOnClickListener {


            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:0770266804")
            startActivity(callIntent)
        }
    }



}