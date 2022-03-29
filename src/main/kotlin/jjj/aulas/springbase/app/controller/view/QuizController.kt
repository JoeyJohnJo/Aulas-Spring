package jjj.aulas.springbase.app.controller.view

import jjj.aulas.springbase.app.data.Quiz
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class QuizController {

    @GetMapping("")
    fun paginaInicial() = "paginaInicial"

    @GetMapping("/novo")
    fun novoQuiz() = "novoQuiz"

    fun x() {
        var novoQuiz = Quiz(1, "Quiz 1", "Descrição do quiz 1")

    }

}
