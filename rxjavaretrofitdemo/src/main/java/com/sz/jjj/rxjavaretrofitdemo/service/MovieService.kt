package com.sz.jjj.rxjavaretrofitdemo.service

import com.sz.jjj.rxjavaretrofitdemo.model.MovieEntity
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


/**
 * Created by jjj on 2017/7/13.
@description:
 */
interface MovieService {
    @GET("top250")
    fun getTopMovie(@Query("start") start: Int, @Query("count") count: Int): Call<MovieEntity>

    @GET("top250")
    fun getTopMovie2(@Query("start") start: Int, @Query("count") count: Int): Observable<MovieEntity>
}