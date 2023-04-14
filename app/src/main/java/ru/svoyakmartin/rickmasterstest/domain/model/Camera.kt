package ru.svoyakmartin.rickmasterstest.domain.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Camera(
    @PrimaryKey
    var id: Int = 0,
    var name: String = "",
    var snapshot: String = "",
    var room: String? = null,
    var favorites: Boolean = false,
    var rec: Boolean = false
) : RealmObject()