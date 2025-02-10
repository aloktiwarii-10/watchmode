package com.example.watchmode.presentation.uistate

import com.example.watchmode.domain.Title

data class TitleDetailsUiState(
    val title: Title? = null,
    val isLoading: Boolean = false,
    val error: String? = null

)