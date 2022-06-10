package com.example.valentinabulanova.bottomnavigationviewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.valentinabulanova.bottomnavigationviewlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.add -> {Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()}
                R.id.search -> {Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()}
                R.id.navigate -> {Toast.makeText(this, "Navigate", Toast.LENGTH_SHORT).show()}
            }

            true
        }
    }
}
