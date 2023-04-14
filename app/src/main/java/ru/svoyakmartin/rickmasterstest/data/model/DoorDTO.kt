package ru.svoyakmartin.rickmasterstest.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DoorDTO(
    var id: Int,
    var name: String,
    var room: String?,
    var snapshot: String?,
    var favorites: Boolean
)