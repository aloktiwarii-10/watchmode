package com.example.watchmode.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.watchmode.presentation.screens.FavoritesScreen

internal const val favoritesScreenRoute = "favorites"


fun NavGraphBuilder.favoritesScreen() {

    composable(favoritesScreenRoute) {
        FavoritesScreen()
    }
}

fun NavController.navigateToFavoritesScreen(
    navOptions: NavOptions? = null
) {
    navigate(favoritesScreenRoute, navOptions)

}