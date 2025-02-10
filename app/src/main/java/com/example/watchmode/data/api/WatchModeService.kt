package com.example.watchmode.data.api


import com.example.watchmode.data.model.ReleaseSuccessResponse
import com.example.watchmode.data.model.SearchSuccessResponse
import com.example.watchmode.data.model.TitleDetailsSuccessResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WatchModeService {

    @GET("releases/")
    suspend fun getReleases(
        @Query("apiKey") apiKey: String
    ): ReleaseSuccessResponse


    @GET("title/{titleId}/details/")
    suspend fun getTitleDetails(
        @Path("titleId") titleId: Int,
        @Query("apiKey") apiKey: String
    ): TitleDetailsSuccessResponse

    @GET("autocomplete-search/")
    suspend fun getSearch(
        @Query("apiKey") apiKey: String,
        @Query("search_value") searchValue: String,
        @Query("search_type") searchType: Int = 2
    ): SearchSuccessResponse

}