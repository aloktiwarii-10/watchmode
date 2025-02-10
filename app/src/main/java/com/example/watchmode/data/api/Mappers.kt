package com.example.watchmode.data.api

import com.example.watchmode.data.model.ReleaseSuccessResponse
import com.example.watchmode.data.model.SearchSuccessResponse
import com.example.watchmode.data.model.TitleDetailsSuccessResponse
import com.example.watchmode.domain.Title


fun ReleaseSuccessResponse.Release.toTitle(): Title {
    return Title(
        id = id,
        title = title,
        poster = poster_url,
        plot = null,
        year = null,
        endYear = null,
        genreNames = null,
        userRating = null,
        criticScore = null
    )
}


fun TitleDetailsSuccessResponse.toTitle(): Title {
    return Title(
        id = id,
        title = title,
        poster = poster,
        plot = plot_overview,
        year = year,
        endYear = end_year,
        genreNames = genre_names,
        userRating = user_rating,
        criticScore = critic_score
    )
}

fun SearchSuccessResponse.Result.toTitle(): Title {
    return Title(
        id = id,
        title = name,
        poster = image_url,
        plot = null,
        year = null,
        endYear = null,
        genreNames = null,
        userRating = null,
        criticScore = null
    )
}


