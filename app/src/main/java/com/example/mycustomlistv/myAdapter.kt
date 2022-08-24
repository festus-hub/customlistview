package com.example.mycustomlistv


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter (var mCtx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mCtx,resources,items) {


 override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
     val layoutInflater:LayoutInflater=LayoutInflater.from(mCtx)
     val view:View=layoutInflater.inflate(resources,null)

    val imageView:ImageView=view.findViewById(R.id.image)
    val titleview:TextView=view.findViewById(R.id.textview1)
    val descriptionview:TextView=view.findViewById(R.id.textview2)

   var mItems:Model=items[position]
    imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.img))
    titleview.text=mItems.tittle
    descriptionview.text=mItems.description


  return view
 }
}