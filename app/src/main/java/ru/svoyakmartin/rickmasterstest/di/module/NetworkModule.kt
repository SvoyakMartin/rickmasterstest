package ru.svoyakmartin.rickmasterstest.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import ru.svoyakmartin.rickmasterstest.di.provider.JsonConverterFactoryProvider
import ru.svoyakmartin.rickmasterstest.di.provider.OkHttpClientProvider
import ru.svoyakmartin.rickmasterstest.di.provider.RetrofitProvider

@Module
object NetworkModule {
    @Provides
    fun provideRetrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        jsonConverterFactory: Converter.Factory
    ): Retrofit = RetrofitProvider.get(baseUrl, okHttpClient, jsonConverterFactory)

    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClientProvider.get()

    @Provides
    fun provideJsonConverterFactory(): Converter.Factory = JsonConverterFactoryProvider.get()

    @Provides
    fun provideBaseUrl() = "http://cars.cprogroup.ru/api/rubetek/"
}