package com.example.dessertclicker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF006780),        // barra superior (azul verdoso)
    onPrimary = Color.White,
    surface = Color(0xFFCFE6F1),        // franja inferior azul claro
    onSurface = Color(0xFF001F28)
)

@Composable
fun DessertClickerTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = LightColors, content = content)
}