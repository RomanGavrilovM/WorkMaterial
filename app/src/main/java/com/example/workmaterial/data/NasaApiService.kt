package com.example.workmaterial.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.workmaterial.domain.entity.NASAImageResponse

interface NasaApiService {
    @GET("planetary/apod")
    fun getImage(@Query("api_key") apiKey: String): Call<NASAImageResponse>
}