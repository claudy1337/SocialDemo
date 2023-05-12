package com.autonture.socialdemo

import android.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.autonture.socialdemo.databinding.ActivityCreatePostBinding
import com.autonture.socialdemo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class CreatePost : AppCompatActivity() {
    lateinit var bindingCreate: ActivityCreatePostBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCreate = ActivityCreatePostBinding.inflate(layoutInflater)
        setContentView(bindingCreate.root)


      //loadFragment(BlankFragmentEntries())
     // navController= Navigation.findNavController(this,bindingCreate.)
      //setupWithNavController(bindingCreate.bottomNavigationView,navController)
    }
    private  fun loadFragment(fragment: Fragment){
      //  supportFragmentManager.
       // beginTransaction()
       //     .replace(com.autonture.socialdemo.R.id.framecontainer, fragment).commit()
    }
}