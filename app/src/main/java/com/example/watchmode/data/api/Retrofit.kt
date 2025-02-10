package com.example.watchmode.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val loggingInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

val okHttpClient = OkHttpClient.Builder()
    .addInterceptor(loggingInterceptor)
    .build()

internal val watchModeApi = Retrofit.Builder()
    .baseUrl("https://api.watchmode.com/v1/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(okHttpClient)
    .build()