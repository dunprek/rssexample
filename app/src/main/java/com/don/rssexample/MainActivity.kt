package com.don.rssexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.don.rssexample.base.BaseActivity
import com.don.rssexample.model.Item
import com.don.rssexample.model.Rss
import com.don.rssexample.view.list_news.NewsAdapter
import com.don.rssexample.view.list_news.NewsDetailsActivity
import com.don.rssexample.view.list_news.NewsListPresenter
import com.don.rssexample.view.list_news.NewsListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity(), NewsListView, NewsAdapter.OnClickItem {
    private lateinit var presenter: NewsListPresenter
    lateinit var mAdapter: NewsAdapter
    var listNews: MutableList<Item> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = NewsListPresenter(this)
        presenter.getNewsList()
    }


    private fun initRec() {
        val linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        rv.setHasFixedSize(true)
        rv.isNestedScrollingEnabled = false
        mAdapter = NewsAdapter(listNews, this, this)
        rv.adapter = mAdapter
    }


    override fun onClickCard(item: Item) {
        val intent = (Intent(this, NewsDetailsActivity::class.java))
        intent.putExtra("NEWS_URL", item.link)
        startActivity(intent)
    }

    override fun onNewsListSuccess(response: Rss) {
        listNews = response.channel.item
        Log.wtf("REST", listNews[0].enclosure.url.toExternalForm())
        initRec()
    }

    override fun showLoading() {
    }

    override fun errorLoading(errorMessage: String?) {
    }

    override fun stopLoading() {
    }

}
