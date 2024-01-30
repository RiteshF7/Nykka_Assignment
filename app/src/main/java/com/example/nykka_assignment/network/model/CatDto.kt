package com.example.nykka_assignment.network.model

import com.google.gson.annotations.SerializedName

data class CatDto(


    @SerializedName("id")
    var id: String,


    @SerializedName("url")
    var url: String,


    @SerializedName("width")
    var width: Int,

    @SerializedName("height")
    var height: Int,
)