package com.don.rssexample.view.list_news

import com.don.rssexample.base.BaseObserver
import com.don.rssexample.base.BasePresenter
import com.don.rssexample.data.newsListRepo.NewsListRepository
import com.don.rssexample.model.Rss
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by gideon on 28,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

class NewsListPresenter(mView: NewsListView) : BasePresenter<NewsListView>(mView) {
    var mRequest = NewsListRepository()

    fun getNewsList() {
        mView.showLoading()
        mRequest.getNewsList()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : BaseObserver<Rss>() {
                override fun onError(e: Throwable) {
                    super.onError(e)
                    mView.stopLoading()
             }
                override fun onResponseError(errorMessage: String) {
                    mView.stopLoading()
                    mView.errorLoading(errorMessage)
                }

                override fun onResponseSuccess(result: Rss) {
                    mView.stopLoading()
                    mView.onNewsListSuccess(result)

                }

            })
    }

}