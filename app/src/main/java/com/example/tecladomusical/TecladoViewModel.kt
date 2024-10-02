package com.example.tecladomusical

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TecladoViewModel : ViewModel() {
    val notas = listOf("DO", "RE", "MI", "FA", "SOL", "LA", "SI")

    private val _notaActual = MutableStateFlow<String?>(null)
    val notaActual: StateFlow<String?> = _notaActual

    fun cambiarNota(nuevaNota: String) {
        _notaActual.value = nuevaNota
    }
}
