package com.example.karakolbazary.ui.developers

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.karakolbazary.R

class DevelopersFragment : Fragment() {

    companion object {
        fun newInstance() = DevelopersFragment()
    }

    private lateinit var viewModel: DevelopersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.developers_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DevelopersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}