package com.example.lab05.domain.model

import android.location.Location
import android.webkit.WebStorage.Origin

data class Object(
    val id: Int,
    val origin: Origin,
    val location: Location
)
