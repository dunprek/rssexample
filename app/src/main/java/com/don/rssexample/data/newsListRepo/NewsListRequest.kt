package com.don.rssexample.data.newsListRepo

import com.don.rssexample.model.Rss
import io.reactivex.Observable

/**
 * Created by gideon on 28,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
interface NewsListRequest {
    fun getNewsList(): Observable<Rss>
}