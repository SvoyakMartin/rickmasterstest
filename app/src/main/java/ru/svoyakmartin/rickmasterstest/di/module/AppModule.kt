package ru.svoyakmartin.rickmasterstest.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create
import ru.svoyakmartin.rickmasterstest.data.ds.ServiceApi

@Module
object AppModule {
    @Provides
    fun provideServiceApi(retrofit: Retrofit): ServiceApi = retrofit.create()
}