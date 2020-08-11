package com.example.karakolbazary.ui.all

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.karakolbazary.R
import com.example.karakolbazary.adabters.AllAdAdapter
import com.example.karakolbazary.adabters.CategoriesAdapter
import com.example.karakolbazary.models.AllAds
import com.example.karakolbazary.models.Categories
import com.example.karakolbazary.ui.detail.DetailInfoActivity
import kotlinx.android.synthetic.main.fragment_all.*

class allFragment : Fragment(), AllAdAdapter.OnAllAdClickListener, CategoriesAdapter.OnCatClickListener {

    private lateinit var allViewModel: AllViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        catRecyclerInit()
        recyclerInit()
        Log.e("MyTag", generateList().toString())

    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        allViewModel =
                ViewModelProviders.of(this).get(AllViewModel::class.java)



        return inflater.inflate(R.layout.fragment_all, container, false)
    }

    private fun recyclerInit(){

        val AllAdList = generateList()

        main_recyclerview.adapter = AllAdAdapter(AllAdList, this)
        main_recyclerview.layoutManager = GridLayoutManager(context, 2)
        main_recyclerview.setHasFixedSize(true)

    }

    private fun catRecyclerInit(){
        val catList = generateCatList()

        categories_recycler.adapter = CategoriesAdapter(catList, this)
        categories_recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        categories_recycler.setHasFixedSize(true)

    }

    private fun generateCatList() : List<Categories>{
        val list = ArrayList<Categories>()
        list.add(Categories(R.drawable.ic_about, "Услуги"))
        list.add(Categories(R.drawable.ic_all, "Авто"))
        list.add(Categories(R.drawable.ic_category, "Недвижимость"))
        list.add(Categories(R.drawable.ic_developers, "Скот"))
        list.add(Categories(R.drawable.ic_about, "Электроника"))
        list.add(Categories(R.drawable.ic_all, "Попутчик"))
        list.add(Categories(R.drawable.ic_category, "Вещи"))
        list.add(Categories(R.drawable.ic_developers, "Детская"))

        return list
    }

    private fun  generateList(): List<AllAds>{
        val list = ArrayList<AllAds>()
        list.add(AllAds(R.drawable.karakol, "Кой сатылат", "7000 com", "10.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Уй сатылат", "40000 dollar", "11.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Машина сатылат", "10000 dollar", "6.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Жер тээп берем", "1000 com", "4.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Кой сатылат", "7000 com", "10.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Уй сатылат", "40000 dollar", "11.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Машина сатылат", "10000 dollar", "6.10.2020"))
        list.add(AllAds(R.drawable.karakol, "Жер тээп берем", "1000 com", "4.10.2020"))

        return list
    }



    override fun onAllAdClick(position: Int) {
        startActivity(Intent(context, DetailInfoActivity::class.java))
    }

    override fun onCatClick(position: Int) {
        Toast.makeText(context, position.toString(), Toast.LENGTH_SHORT).show()
    }

}