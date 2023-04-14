package ru.svoyakmartin.rickmasterstest.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CameraDTO(
    var id: Int,
    var name: String,
    var snapshot: String,
    var room: String?,
    var favorites: Boolean,
    var rec: Boolean
)