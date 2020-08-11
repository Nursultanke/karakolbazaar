package com.example.karakolbazary.ui.aboutapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.karakolbazary.R

class AboutAppFragment : Fragment() {

    companion object {
        fun newInstance() = AboutAppFragment()
    }

    private lateinit var viewModel: AboutAppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_app_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AboutAppViewModel::class.java)
        // TODO: Use the ViewModel
    }

}