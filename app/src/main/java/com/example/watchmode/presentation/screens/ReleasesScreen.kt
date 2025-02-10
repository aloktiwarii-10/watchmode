package com.example.watchmode.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.watchmode.domain.Title
import com.example.watchmode.domain.titlesSample
import com.example.watchmode.presentation.components.MovieGrid
import com.example.watchmode.presentation.uistate.ReleasesUiState


@Composable
fun ReleasesScreen(
    uiState: ReleasesUiState,
    onMovieClick: (Title) -> Unit = {}
) {
    MovieGrid(
        uiState.releases,
        onMovieClick = onMovieClick
    )

}


@Preview(showBackground = true)
@Composable
private fun ReleasesScreenPreview() {
    ReleasesScreen(uiState = ReleasesUiState(titlesSample))
}

