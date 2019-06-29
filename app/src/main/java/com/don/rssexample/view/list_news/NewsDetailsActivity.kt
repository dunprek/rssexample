package com.don.rssexample.view.list_news

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.don.rssexample.R
import kotlinx.android.synthetic.main.activity_news_details.*
import android.webkit.WebViewClient



class NewsDetailsActivity : AppCompatActivity() {

    var url = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        try {
            url = intent.extras.get("NEWS_URL").toString()
            Log.d("NEWS-URL", "URL NYA ++++++ $url")
        } catch (e: Exception) {
            url = "http://news.detik.com"
        }
        wv.settings.javaScriptEnabled = true
        wv.setWebViewClient(WebViewClient())
        wv.loadUrl(url)
    }
}
