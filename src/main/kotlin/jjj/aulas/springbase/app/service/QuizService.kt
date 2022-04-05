package jjj.aulas.springbase.app.service

import jjj.aulas.springbase.app.data.Quiz
import jjj.aulas.springbase.app.data.QuizRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.net.URI
import java.util.*

@Service
class QuizService(private val quizRepository: QuizRepository) {

    fun salvarQuiz(@RequestBody quiz: Quiz): ResponseEntity<String> =
        ResponseEntity.created(URI("/quizzes/${quizRepository.save(quiz).id}")).build()

    fun buscarQuizzes(): List<Quiz> = quizRepository.findAll()

    fun buscarQuiz(id: Long): ResponseEntity<Quiz> = quizRepository.findById(id).map { ResponseEntity.ok(it) }
        .orElse(ResponseEntity.notFound().build())

    fun editarQuiz(id: Long, quiz: Quiz): ResponseEntity<Quiz> {
        val antigo = quizRepository.findById(id)
        if (antigo.isEmpty)
            return ResponseEntity.notFound().build()

        val quizAtualizado = quiz.copy(id = antigo.get().id)
        quizRepository.save(quizAtualizado)
        return ResponseEntity.ok(quizAtualizado)
    }

    fun deletarQuiz(id: Long): ResponseEntity<String> {
        val quizNoBanco: Optional<Quiz> = quizRepository.findById(id)
        if (quizNoBanco.isEmpty)
            return ResponseEntity.notFound().build()

        quizRepository.deleteById(id)
        return ResponseEntity.ok("Quiz $id deletado com sucesso")
    }
}