package ru.svoyakmartin.rickmasterstest

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import ru.svoyakmartin.rickmasterstest.di.AppComponent
import ru.svoyakmartin.rickmasterstest.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory()
            .create()

        Realm.init(this)
        val config = RealmConfiguration.Builder().build()
        Realm.setDefaultConfiguration(config)
    }
}