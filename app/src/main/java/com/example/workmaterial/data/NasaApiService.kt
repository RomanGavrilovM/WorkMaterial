package com.example.workmaterial.data

import retrofit2.Call
import retrofit2.http.*
import com.example.workmaterial.domain.NASAImageResponse

interface NasaApiService {
    @GET("planetary/apod")
    fun getImage(@Query("api_key") apiKey:String): Call<NASAImageResponse>
}