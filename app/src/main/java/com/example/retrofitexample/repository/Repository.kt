package com.example.retrofitexample.repository

import com.example.retrofitexample.api.RetrofitInstance
import com.example.retrofitexample.model.NudgeDataclass
import com.example.retrofitexample.model.Post
import retrofit2.Call
import retrofit2.Response

class Repository {
    suspend fun getPost(): Post{
        return RetrofitInstance.api.getPost()
    }
    suspend fun getNudgeRespose(): NudgeDataclass{
        return RetrofitInstance.nudgeApi.getnudge()
    }
}