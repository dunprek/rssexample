package com.don.rssexample.util

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.don.rssexample.R

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

object GlideUtil {
    fun glideCenterCropRoundedCorner(context: Context, url: String, iv: ImageView) {
        val requestOptions = RequestOptions()
        val options = requestOptions.transforms(CenterCrop(), RoundedCorners(8))

        try {
            Glide.with(context)
                .load(url)
                .apply(options)
                .thumbnail(Glide.with(context).load(R.drawable.loadingglide))
                .into(iv)
        } catch (e: Exception) {
            Glide.with(context)
                .load(R.mipmap.ic_launcher)
                .into(iv)
        }
    }


    /*Picasso
                   .get()
                   .load(printerList[pos].imageUrl)
                   .placeholder(R.mipmap.ic_launcher) // can also be a drawable
                   .fit()
                   .into(ivPrinter)*/

    fun glideWithPlaceHolder(context: Context, url: String, iv: ImageView) {

        val requestOptions = RequestOptions()
        val options =
            requestOptions
                .placeholder(R.mipmap.ic_launcher)
                .transforms(CenterCrop(), RoundedCorners(8))

        try {
            Glide.with(context)
                .load(url)
                .apply(options)
                .into(iv)
        } catch (e: Exception) {
            Glide.with(context)
                .load(R.mipmap.ic_launcher)
                .into(iv)
        }

    }


    fun glideOverrideSize(context: Context, url: String, iv: ImageView) {


        val requestOptions = RequestOptions()
        val options =
            requestOptions
                .placeholder(R.mipmap.ic_launcher)
                .override(200, 200)
                .transforms(CenterCrop(), RoundedCorners(8))



        try {
            Glide.with(context)
                .load(url)
                .apply(options)
                .into(iv)
        } catch (e: Exception) {
            Glide.with(context)
                .load(R.mipmap.ic_launcher)
                .into(iv)
        }
    }


    fun getURLForResource(resourceId: Int): String {
        return Uri.parse("android.resource://" + R::class.java!!.getPackage().getName() + "/" + resourceId).toString()
    }
}