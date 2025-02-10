package com.example.watchmode.presentation.uistate

import com.example.watchmode.domain.Title

data class ReleasesUiState(
    val releases: List<Title> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null

)