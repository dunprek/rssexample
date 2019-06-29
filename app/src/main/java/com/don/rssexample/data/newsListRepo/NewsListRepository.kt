package com.don.rssexample.data.newsListRepo

import com.don.rssexample.base.BaseRepository
import com.don.rssexample.model.Rss
import io.reactivex.Observable

/**
 * Created by gideon on 28,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

class NewsListRepository : BaseRepository(), NewsListRequest {
    override fun getNewsList(): Observable<Rss> {
        return mApiClient.mApiServices.getFeed().flatMap { Observable.just(it) }
    }
}
