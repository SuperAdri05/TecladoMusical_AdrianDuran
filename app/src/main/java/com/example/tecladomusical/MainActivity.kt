package com.example.tecladomusical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.tecladomusical.ui.theme.TecladoMusicalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val generadorDeSonido = GeneradorDeSonido(this)

        setContent {
            TecladoMusicalTheme {
                PianoKeyboard(generadorDeSonido)
            }
        }
    }
}

@Composable
fun PianoKeyboard(generadorDeSonido: GeneradorDeSonido) {

    val configuration = LocalConfiguration.current


    val screenHeight = configuration.screenHeightDp.dp


    val notas = listOf("DO", "RE", "MI", "FA", "SOL", "LA", "SI")


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
    ) {
        val teclaHeight = screenHeight / notas.size

        notas.forEach { nota ->
            TeclaMusical(
                nota = nota,
                onClick = { generadorDeSonido.reproducirNota(nota) },
                height = teclaHeight
            )
        }
    }
}



