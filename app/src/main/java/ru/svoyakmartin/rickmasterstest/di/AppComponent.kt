package ru.svoyakmartin.rickmasterstest.di

import dagger.Component
import ru.svoyakmartin.rickmasterstest.di.module.AppModule

@Component(
    modules = [AppModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

//    fun inject(application: App)
}