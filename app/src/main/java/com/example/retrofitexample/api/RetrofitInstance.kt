package com.example.retrofitexample.api

import com.example.retrofitexample.utils.Constants
import com.example.retrofitexample.utils.Constants.Companion.BASE_URL
import com.example.retrofitexample.utils.Constants.Companion.NUDGE_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private  val  retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val  api: SampleApi by lazy {
        retrofit.create(SampleApi::class.java)
    }

    private val nudgeClient by lazy {
        Retrofit.Builder()
            .baseUrl(NUDGE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val nudgeApi: SampleApi by lazy {
        nudgeClient.create(SampleApi::class.java)
    }
}