package com.example.android_app.network

import com.example.android_app.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET("top-headlines?country=us&apikey=adc8981d89e94849a1d47bc15f6109cb")
    suspend fun getTopHeadline(): NewsData

    //Define API lain-lain
}

object Api{
    val newsAPIService : NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
       }
}