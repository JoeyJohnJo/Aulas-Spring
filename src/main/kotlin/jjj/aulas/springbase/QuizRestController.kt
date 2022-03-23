package jjj.aulas.springbase

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuizRestController {

    @PostMapping("/salvar")
    fun salvarQuiz(@RequestBody quiz: Quiz): ResponseEntity<String> {
        println("O usuario enviou um novo quiz para o servidor")
        println(quiz)
        return ResponseEntity.ok("Quiz salvo com sucesso")
    }
}
