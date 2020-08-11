package com.example.karakolbazary.ui.give_ad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.karakolbazary.R

class GiveAdFragment : Fragment() {

    private lateinit var giveAdViewModel: GiveAdViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        giveAdViewModel =
                ViewModelProviders.of(this).get(GiveAdViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_give_ad, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        giveAdViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}