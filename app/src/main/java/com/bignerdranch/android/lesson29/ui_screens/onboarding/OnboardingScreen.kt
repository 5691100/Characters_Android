package com.bignerdranch.android.lesson29.ui_screens.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.bignerdranch.android.lesson29.navigation.CHARACTERS_LIST_SCREEN
import com.bignerdranch.android.lesson29.navigation.CHARACTER_SCREEN

@Composable
fun OnboardingScreen(
    navController: NavHostController
){

    Column {
        Button(onClick = {
            navController.navigate(CHARACTERS_LIST_SCREEN)
        }) {
            Text(text = "Get Started!")
        }
    }
}