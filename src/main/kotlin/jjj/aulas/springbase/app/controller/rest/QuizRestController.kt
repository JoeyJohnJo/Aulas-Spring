package jjj.aulas.springbase.app.controller.rest

import jjj.aulas.springbase.app.data.Quiz
import jjj.aulas.springbase.app.service.QuizService
import org.springframework.web.bind.annotation.*

@RestController
class QuizRestController(private val quizService: QuizService) {

    @PostMapping("/salvar")
    fun salvarQuiz(@RequestBody quiz: Quiz) = quizService.salvarQuiz(quiz)

    @GetMapping("/quizzes")
    fun buscarQuizzes() = quizService.buscarQuizzes()

    // PathVariable: é um parâmetro que vem na URL, significa variável de caminho
    @GetMapping("/quizzes/{id}")
    fun buscarQuiz(@PathVariable id: Long) = quizService.buscarQuiz(id)

    @PatchMapping("/quizzes/{id}")
    fun editarQuiz(@PathVariable id: Long, @RequestBody quiz: Quiz) = quizService.editarQuiz(id, quiz)

    @DeleteMapping("/quizzes/{id}")
    fun deletarQuiz(@PathVariable id: Long) = quizService.deletarQuiz(id)
}
