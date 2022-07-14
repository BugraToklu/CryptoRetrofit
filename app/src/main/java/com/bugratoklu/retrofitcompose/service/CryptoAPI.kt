package com.bugratoklu.retrofitcompose.service

import com.bugratoklu.retrofitcompose.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //BASE -> https://raw.githubusercontent.com/

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Call<List<CryptoModel>>


}