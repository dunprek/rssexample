package com.don.rssexample.view.list_news

import android.content.ContentValues
import android.content.Context
import android.location.Location
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.don.rssexample.R
import com.don.rssexample.model.Item
import com.don.rssexample.model.Rss
import com.don.rssexample.util.GlideUtil
import java.text.DecimalFormat

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */


class NewsAdapter(
    private val data: List<Item>,
    val context: Context,
    val onClickItem: OnClickItem
) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title) as TextView
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc) as TextView
        var iv: ImageView = itemView.findViewById(R.id.iv_item) as ImageView
        var llClick: LinearLayout = itemView.findViewById(R.id.ll_item) as LinearLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result: Item = data.get(position)

        holder.tvTitle.text = result.title
        holder.tvDesc.text = result.pubDate

        GlideUtil.glideOverrideSize(
            context,
            result.enclosure.url.toExternalForm(),
            holder.iv
        )

        holder.llClick.setOnClickListener {
            onClickItem.onClickCard(result)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface OnClickItem {
        fun onClickCard(item: Item)
    }


}