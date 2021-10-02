package com.example.covid19tracker

import okhttp3.OkHttpClient
import okhttp3.Request

object Client {
    private val okhttp=OkHttpClient()
    private val request=Request.Builder().url("https://data.covid19india.org/data.json").build()
    val result= okhttp.newCall(request)
}