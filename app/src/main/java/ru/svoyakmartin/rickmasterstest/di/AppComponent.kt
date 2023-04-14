package ru.svoyakmartin.rickmasterstest.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
//        AppModule::class,
//        NetworkModule::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

//    fun inject(application: App)
}