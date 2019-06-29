package com.don.rssexample.base

import com.don.rssexample.BuildConfig.BASE_URL
import com.don.rssexample.repository.ApiClient

/**
 * Created by gideon on 27,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

open class BaseRepository{
    var mApiClient: ApiClient = ApiClient(BASE_URL)
}