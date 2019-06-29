package com.don.rssexample.view.list_news

import com.don.rssexample.base.BaseView
import com.don.rssexample.model.Rss

/**
 * Created by gideon on 28,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
interface NewsListView :BaseView {
    fun onNewsListSuccess(response: Rss)
}