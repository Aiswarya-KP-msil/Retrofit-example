package com.example.retrofitexample.api

import com.example.retrofitexample.model.NudgeDataclass
import com.example.retrofitexample.model.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface SampleApi {
    @GET("posts/1")
    suspend fun getPost(): Post

    @POST
    suspend fun getnudge(): NudgeDataclass
}