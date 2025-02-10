package com.example.watchmode.presentation.uistate

import com.example.watchmode.domain.Title

data class SearchUiState(
    val result: List<Title> = emptyList(),
    val searchText: String = "",
    val onSearchChange: (String) -> Unit = {},
    val isLoading: Boolean = false,
    val error: String? = null

) {


}