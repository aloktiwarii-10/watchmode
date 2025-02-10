package com.example.watchmode.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watchmode.domain.Title
import com.example.watchmode.domain.titlesSample
import com.example.watchmode.presentation.components.MoviesVerticalList
import com.example.watchmode.presentation.components.SearchTextField
import com.example.watchmode.presentation.uistate.SearchUiState

@Composable
fun SearchScreen(
    uiState: SearchUiState,
    onTitleClick: (Title) -> Unit,
) {
    val text = uiState.searchText
    val searchResult = uiState.result

    Column {

        SearchTextField(
            searchText = text,
            onSearchChange = uiState.onSearchChange,
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )

        MoviesVerticalList(titles = searchResult, onTitleClick)
    }


}


@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen(SearchUiState()){}
}


@Preview(showBackground = true)
@Composable
private fun SearchScreenPreviewWithValue() {
    SearchScreen(SearchUiState(titlesSample)){}
}





