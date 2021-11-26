package com.example.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitexample.repository.Repository
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    var repository = Repository()
    var viewModelFactory = MainViewModelFactory(repository)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
       // getMyNudgeDate()
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("body :", response.body.toString())
            Log.d("id :", response.id.toString())
            Log.d("title :", response.title.toString())
            Log.d("userid :", response.userId.toString())
        })

    }

    private fun getMyNudgeDate() {
        viewModel.getNudgeres()
        viewModel.myNudgeResponse.observe(this, Observer { nudgeResponse ->
            Log.d("NudgeResponse :", nudgeResponse.nudges.toString())
        })

    }


}