package com.example.watchmode.presentation.navigation

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.watchmode.domain.Title
import com.example.watchmode.presentation.screens.SearchScreen
import com.example.watchmode.presentation.viewmodels.SearchViewModel

internal const val searchScreenRoute = "search"

fun NavGraphBuilder.searchScreen(onTitleClick: (Title) -> Unit) {
    composable(searchScreenRoute) {
        val viewModel: SearchViewModel = viewModel<SearchViewModel>()
        val state = viewModel.uiState.collectAsState().value

        SearchScreen(state, onTitleClick)

    }
}

fun NavController.navigateToSearchScreen(
    navOptions: NavOptions? = null
) {
    navigate(searchScreenRoute, navOptions)
}
