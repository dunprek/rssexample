package com.don.rssexample.repository

import com.don.rssexample.model.Rss
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by gideon on 27,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
interface ApiServices {
    /**
     * GET-------------------------------------------------------------------------------------------------------------------------
     */

//    http://rss.detik.com/index.php/detikcom_internasional
    @GET("index.php/detikcom_internasional")
    fun getFeed(): Observable<Rss>

}
