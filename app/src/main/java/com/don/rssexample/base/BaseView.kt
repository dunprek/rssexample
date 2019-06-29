package com.don.rssexample.base

/**
 * Created by gideon on 27,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
interface BaseView {
    fun showLoading()
    fun errorLoading(errorMessage:String?)
    fun stopLoading()
}