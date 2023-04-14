package ru.svoyakmartin.rickmasterstest.domain.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Door(
    @PrimaryKey
    var id: Int = 0,
    var name: String = "",
    var room: String? = null,
    var snapshot: String? = null,
    var favorites: Boolean = false
) : RealmObject()