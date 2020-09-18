package com.rayray.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.rayray.madlevel2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val PLACES = arrayListOf<Place>()
    private val PLACE_ADAPTER = PlaceAdapter(PLACES)

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.rvPlaces.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.rvPlaces.adapter = PLACE_ADAPTER

        for (i in Place.PLACE_NAMES.indices){
            PLACES.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RES_DRAWABLE_IDS[i]))
        }
        PLACE_ADAPTER.notifyDataSetChanged()
    }
}