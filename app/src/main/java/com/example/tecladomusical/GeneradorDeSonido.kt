package com.example.tecladomusical

import android.content.Context
import android.media.MediaPlayer

class GeneradorDeSonido(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null

    fun reproducirNota(nota: String) {
        mediaPlayer?.stop()
        mediaPlayer?.release()

        val resourceId = when (nota) {
            "DO" -> R.raw.doo
            "RE" -> R.raw.fa
            "MI" -> R.raw.la
            "FA" -> R.raw.fa
            "SOL" -> R.raw.sol
            "LA" -> R.raw.la
            "SI" -> R.raw.si
            else -> R.raw.doo
        }

        mediaPlayer = MediaPlayer.create(context, resourceId)
        mediaPlayer?.start()
    }
}
