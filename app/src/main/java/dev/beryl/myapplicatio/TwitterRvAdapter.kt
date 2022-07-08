package dev.beryl.myapplicatio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList: List<tweet> ):
    RecyclerView.Adapter<twitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_item_list,parent,false)
        return twitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text=currentTwitter.Name
        holder.tvComment.text=currentTwitter.Comment
        holder.tvnumber.text=currentTwitter.Number
        holder.tvnumbertwo.text=currentTwitter.Numbertwo



    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}
class twitterViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvComment=itemView.findViewById<TextView>(R.id.tvComment)
    var tvnumber=itemView.findViewById<TextView>(R.id.tvnumber)
    var tvnumbertwo=itemView.findViewById<TextView>(R.id.tvnumbertwo)
    var imgPerson=itemView.findViewById<ImageView>(R.id.imgperson)

}