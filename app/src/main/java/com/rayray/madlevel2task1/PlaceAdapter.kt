package com.rayray.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rayray.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val PLACES: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val BINDING = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place) {
            BINDING.ivPlace.setImageResource(place.imageResId)
            BINDING.tvPlace.text = place.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent,
                false)
        )
    }

    override fun getItemCount(): Int {
        return PLACES.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(PLACES[position])
    }
}