package ru.svoyakmartin.rickmasterstest.di.provider

import okhttp3.OkHttpClient

object OkHttpClientProvider {
    fun get() : OkHttpClient{
        val builder = OkHttpClient.Builder()
        return builder.build()
    }
}