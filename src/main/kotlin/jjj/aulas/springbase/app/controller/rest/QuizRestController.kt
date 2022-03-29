package jjj.aulas.springbase.app.controller.rest

import jjj.aulas.springbase.app.data.Quiz
import jjj.aulas.springbase.app.data.QuizRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuizRestController(private val quizRepository: QuizRepository) {

    @PostMapping("/salvar")
    fun salvarQuiz(@RequestBody quiz: Quiz): ResponseEntity<String> {
        quizRepository.save(quiz)
        return ResponseEntity.ok("Quiz salvo com sucesso")
    }

    @GetMapping("/quizzes")
    fun buscarQuizzes(): List<Quiz> = quizRepository.findAll()
}
