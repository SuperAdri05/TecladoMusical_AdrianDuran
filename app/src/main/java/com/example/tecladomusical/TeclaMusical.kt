package com.example.tecladomusical

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TeclaMusical(nota: String, onClick: () -> Unit, height: androidx.compose.ui.unit.Dp) {
    val colorDeTecla = when (nota) {
        "DO" -> Color.Red
        "RE" -> Color.Green
        "MI" -> Color.Blue
        "FA" -> Color.Yellow
        "SOL" -> Color.Magenta
        "LA" -> Color.Cyan
        "SI" -> Color.White
        else -> Color.LightGray
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .background(colorDeTecla)
            .border(1.dp, Color.DarkGray)
            .clickable { onClick() }
    ) {
    }
}


