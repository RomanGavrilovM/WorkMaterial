package com.example.workmaterial.domain

sealed class DailyImage {

    data class Success(val serverResponseData: NASAImageResponse) : DailyImage()

    data class Error(val error: Throwable) : DailyImage()

    data class Loading(val progress: Int?) : DailyImage()

}