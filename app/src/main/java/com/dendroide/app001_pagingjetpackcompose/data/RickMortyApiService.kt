package com.dendroide.app001_pagingjetpackcompose.data

import com.dendroide.app001_pagingjetpackcompose.data.response.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyApiService {
    @GET("/api/character/")
    suspend fun getCharacters(@Query("page") page: Int): ResponseWrapper
}