package com.autonture.socialdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.autonture.socialdemo.databinding.ActivityMainBinding
import com.autonture.socialdemo.databinding.FragmentBlankEntriesBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    lateinit var bindingMain: ActivityMainBinding
    lateinit var bindingFragment: FragmentBlankEntriesBinding

    private val fragList = listOf(
        BlankFragmentEntries.newInstance(),
        BlankFragmentTrips.newInstance()
    )
    companion object {
        val IMAGE_REQUEST_CODE = 1_000;
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        bindingMain.imageView.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        bindingMain.button.setOnClickListener {
            val pickImg = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            changeImage.launch(pickImg)
        }
        bindingMain.tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                supportFragmentManager.
                beginTransaction()
                    .replace(R.id.frameImage, fragList[tab?.position!!]).commit()
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
                //update повторное нажатие на вкладку
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //update потом запуск первой страницы
            }

        })
        supportFragmentManager.
        beginTransaction()
            .replace(R.id.frameImage, fragList[1]).commit()

        bindingMain.swipeRefresh.setOnRefreshListener{
            Handler().postDelayed(Runnable {
                bindingMain.swipeRefresh.isRefreshing = false
            }, 4000)
        }

    }


    private val changeImage =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            if (it.resultCode == Activity.RESULT_OK) {
                val data = it.data
                val imgUri = data?.data
                bindingMain.imageView.setImageURI(imgUri)
            }
        }

}