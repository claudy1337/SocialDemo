package com.autonture.socialdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialdemo.databinding.ActivityMain2Binding
import com.autonture.socialdemo.databinding.ActivityMainBinding
import com.autonture.socialdemo.databinding.FragmentBlankEntriesBinding

class BlankFragmentEntries : Fragment() {

    private val adapter = EntriesAdapter(Constants.getEmployeeData())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank_entries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lateinit var bindingFragment: FragmentBlankEntriesBinding
        super.onViewCreated(view, savedInstanceState)
        val entrieslist= Constants.getEmployeeData() //данные из бд
        val itemAdapter=EntriesAdapter(entrieslist)
        val recyclerView: RecyclerView =view.findViewById(R.id.recyclerView)
      //  val btn: Button = view.findViewById(R.id.button3)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = itemAdapter
        recyclerView.adapter = adapter
       // btn.setOnClickListener {
      //      val entries = EntriesClass("Aboba Boba", "@aboba_boba", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...")
       //    adapter.addEntries(entries)
      //  }

    }
    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentEntries()
    }
}