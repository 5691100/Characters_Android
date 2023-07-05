package com.bignerdranch.android.lesson29.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.bignerdranch.android.lesson29.ui_screens.characterInfo.CharacterScreen
import com.bignerdranch.android.lesson29.ui_screens.charactersList.CharacterListScreen
import com.bignerdranch.android.lesson29.ui_screens.onboarding.OnboardingScreen

const val CHARACTERS_LIST_SCREEN = "charactersListScreen"
const val CHARACTER_SCREEN = "characterScreen"
const val ONBOARDING_SCREEN = "onboardingScreen"

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ONBOARDING_SCREEN
    ) {
        composable(ONBOARDING_SCREEN) { OnboardingScreen(navController)}
        composable(CHARACTERS_LIST_SCREEN) { CharacterListScreen(navController) }
        composable(
            "$CHARACTER_SCREEN/{characterId}",
            arguments = listOf(navArgument("characterId") { type = NavType.StringType })
        )
        {
            CharacterScreen(
                navController,
                it.arguments?.getString("characterId", "5") ?: "5")
        }
    }
}