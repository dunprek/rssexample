package com.don.rssexample.base

import io.reactivex.disposables.Disposable

/**
 * Created by gideon on 27,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

class DisposableManager {

    //    private var compositeDisposable: CompositeDisposable? = null
    private var compositeDisposable: MutableList<Disposable> = mutableListOf()
    fun add(disposable: Disposable) {

        compositeDisposable.add(disposable)


    }

    fun dispose() {
        for (d in compositeDisposable){
            d.dispose()
        }

    }
}