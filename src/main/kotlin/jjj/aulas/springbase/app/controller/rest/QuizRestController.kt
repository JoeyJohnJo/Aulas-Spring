package jjj.aulas.springbase.app.controller.rest

import jjj.aulas.springbase.app.data.Quiz
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuizRestController {

    val quizzesSalvos = mutableListOf<Quiz>()

    @PostMapping("/salvar")
    fun salvarQuiz(@RequestBody quiz: Quiz): ResponseEntity<String> {
        quizzesSalvos.add(quiz)
        return ResponseEntity.ok("Quiz salvo com sucesso")
    }

    @GetMapping("/quizzes")
    fun buscarQuizzes() = quizzesSalvos
}
