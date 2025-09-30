package com.unsoed.informatikamobile.data.network

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response
import com.unsoed.informatikamobile.data.model.SearchResponse

interface OpenLibraryApi {
    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): Response<SearchResponse>

}