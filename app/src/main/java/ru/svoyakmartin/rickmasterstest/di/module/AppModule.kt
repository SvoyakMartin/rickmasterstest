package ru.svoyakmartin.rickmasterstest.di.module

import dagger.Module
import dagger.Provides
import io.realm.Realm
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.create
import ru.svoyakmartin.rickmasterstest.data.ds.ServiceApi
import ru.svoyakmartin.rickmasterstest.di.provider.JsonConverterFactoryProvider
import ru.svoyakmartin.rickmasterstest.di.provider.OkHttpClientProvider
import ru.svoyakmartin.rickmasterstest.di.provider.RetrofitProvider
import javax.inject.Singleton

@Module
object AppModule {

    @Provides
    fun provideRealm(): Realm = Realm.getDefaultInstance()

    @[Singleton Provides]
    fun provideServiceApi(retrofit: Retrofit): ServiceApi = retrofit.create()

    @[Singleton Provides]
    fun provideRetrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        jsonConverterFactory: Converter.Factory
    ): Retrofit = RetrofitProvider.get(baseUrl, okHttpClient, jsonConverterFactory)

    @[Singleton Provides]
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClientProvider.get()

    @[Singleton Provides]
    fun provideJsonConverterFactory(): Converter.Factory = JsonConverterFactoryProvider.get()

    @[Singleton Provides]
    fun provideBaseUrl() = "http://cars.cprogroup.ru/api/rubetek/"
}