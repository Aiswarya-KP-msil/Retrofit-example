package com.example.retrofitexample
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofitexample.model.NudgeDataclass
import com.example.retrofitexample.model.Post
import com.example.retrofitexample.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class MainViewModel(private  val repository: Repository): ViewModel()  {
    val myResponse: MutableLiveData<Post> = MutableLiveData()
    val myNudgeResponse: MutableLiveData<NudgeDataclass> = MutableLiveData()
    fun  getPost(){
        CoroutineScope(Dispatchers.IO).launch {
            val response: Post =  repository.getPost()
            myResponse.postValue(response)

        }
    }
    fun getNudgeres(){
        var nudgeResponse: NudgeDataclass
        CoroutineScope(Dispatchers.IO).launch {
                nudgeResponse  = repository.getNudgeRespose()
                myNudgeResponse.postValue(nudgeResponse)

        }
    }

}
