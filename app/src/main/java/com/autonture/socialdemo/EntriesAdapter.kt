package com.autonture.socialdemo

import android.security.identity.CredentialDataResult.Entries
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialdemo.databinding.FragmentGalleryFullscreenBinding

class EntriesAdapter(private val entriesList: ArrayList<EntriesClass>): RecyclerView.Adapter<EntriesAdapter.EntriesHolder>() {

    class EntriesHolder(item:View):RecyclerView.ViewHolder(item){
        val binding = FragmentGalleryFullscreenBinding.bind(item)

        fun bind(entries: EntriesClass) = with(binding){
            // imageView2.setImageResource(entries.image)
            txttitle.text = entries.title
            txttag.text = entries.tag
            txttitle.text = entries.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntriesHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_gallery_fullscreen, parent, false)
        return EntriesHolder(view)
    }

    override fun getItemCount(): Int {
        return entriesList.size
    }

    override fun onBindViewHolder(holder: EntriesHolder, position: Int) {
        holder.bind(entriesList[position])
    }
    fun addEntries(entries: EntriesClass){
        entriesList.add(entries)
        notifyDataSetChanged()
    }
}