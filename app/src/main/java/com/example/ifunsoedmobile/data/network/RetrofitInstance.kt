package com.example.ifunsoedmobile.data.network

import com.example.ifunsoedmobile.data.model.OpenLibraryApi
import com.example.ifunsoedmobile.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: OpenLibraryApi by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.Base_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OpenLibraryApi::class.java)
    }
}