package com.rocky.testglide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RvAdapter2(val context: Context) : RecyclerView.Adapter<RvAdapter2.Holder>() {

    class Holder(view : View) : RecyclerView.ViewHolder(view){
        val iv = view.findViewById<ImageView>(R.id.iv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(context).inflate(R.layout.item2,parent,false))
    }

    val list = mutableListOf(
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/de186135-91a3-4e7f-f48f-6e73907b0900/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/160c3c36-bce5-4ce4-9b4a-61330b56bb00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/c2b272de-693a-4a05-294f-b46afb81ea00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/efe1c8ea-5235-4bea-2dcc-4ec25a668d00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/aba8982e-97c7-4705-ec72-14d2bcbf2500/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/ef0214aa-5dcd-4f51-1fbb-e603f3381800/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/ef0214aa-5dcd-4f51-1fbb-e603f3381800/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/efe1c8ea-5235-4bea-2dcc-4ec25a668d00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/efe1c8ea-5235-4bea-2dcc-4ec25a668d00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/10f29138-83eb-4de4-f579-37b36b7d4800/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/cdeb84a3-f907-49a8-aa37-29ee2924fc00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/c6c9a728-9d92-442c-d061-20061535fa00/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/e8864189-2c80-4329-1e0e-1bd5ba6e0600/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/5934c4f9-bf9c-4d53-5415-fe576c235500/public",
        "https://imagedelivery.net/2chPAg1PDekJ6oI478IB9Q/90180e3e-da73-436a-2a08-721ad99f1d00/public"
    )

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(context)
            .load(list[position])
            .into(holder.iv)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}