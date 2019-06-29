package com.don.rssexample.repository

import com.don.rssexample.BuildConfig
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by gideon on 27,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */


/**
 * Created by gideon on 09/04/18.
 */
class ApiClient(val baseURL: String) {

    lateinit var mApiServices: ApiServices


    init {
        val retrofit = initRetrofit(baseURL)
        initServices(retrofit)

    }

    private fun initServices(retrofit: Retrofit) {
        mApiServices = retrofit.create(ApiServices::class.java)
    }

    fun getApiServices(): ApiServices {
        return mApiServices
    }


    private fun initRetrofit(baseURL: String): Retrofit {


        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }


        val client = OkHttpClient.Builder().apply {
            connectTimeout(10000, TimeUnit.SECONDS)
                .writeTimeout(10000, TimeUnit.SECONDS)
                .readTimeout(10000, TimeUnit.SECONDS)
            networkInterceptors().add(interceptor)
        }

        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
            .client(client.build())
            .build()
    }
}
