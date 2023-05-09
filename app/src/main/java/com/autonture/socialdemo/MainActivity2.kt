package com.autonture.socialdemo

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.OpenableColumns
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.autonture.socialdemo.databinding.ActivityMain2Binding
import com.autonture.socialdemo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingMain2: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingMain2.root)
    }

}