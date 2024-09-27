package com.dendroide.app001_pagingjetpackcompose.data.response

import com.dendroide.app001_pagingjetpackcompose.presentation.model.CharacterModel
import com.google.gson.annotations.SerializedName

data class CharacterResponse (
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("image") val image: String,
){
    fun toPresentation():CharacterModel{
        return CharacterModel(
            id = id,
            name = name,
            image = image,
            isAlive = status == "Alive"
        )
    }
}