package jjj.aulas.springbase.app.data

import java.time.LocalDate.now

data class Quiz(
    val id: Int,
    val nome: String = "",
    val professor: String = "",
    val ano: Int = now().year,
    val semestre: Int = 1
    // private val perguntas: List<Pergunta>
)
