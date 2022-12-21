package com.rocky.testglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val iv = findViewById<ImageView>(R.id.iv)
        val rv = findViewById<RecyclerView>(R.id.rv)
        val rv2 = findViewById<RecyclerView>(R.id.rv2)
        val manager = LinearLayoutManager(this)
        val manager2 = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.HORIZONTAL
        rv.layoutManager = manager
        rv2.layoutManager = manager2

        rv.adapter = RvAdapter(this)
        rv2.adapter = RvAdapter2(this)
        Glide.with(this)
            .load("https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/160c3c36-bce5-4ce4-9b4a-61330b56bb00/public")
            .into(iv)




    }
}