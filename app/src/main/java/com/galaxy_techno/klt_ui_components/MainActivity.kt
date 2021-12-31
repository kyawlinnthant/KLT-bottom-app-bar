package com.galaxy_techno.klt_ui_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            showToast("Click fab")
        }
        findViewById<BottomNavigationView>(R.id.bottom_nav_view).setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_search ->{
                    showToast("Search")
                    true
                }
                R.id.menu_delete ->{
                    showToast("Delete")
                    true
                }
                R.id.menu_profile ->{
                    showToast("Profile")
                    true
                }
                R.id.menu_setting ->{
                    showToast("Setting")
                    true
                }
                else ->{
                    showToast()
                    true
                }
            }
        }
    }

    private fun showToast(msg: String? = null) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}