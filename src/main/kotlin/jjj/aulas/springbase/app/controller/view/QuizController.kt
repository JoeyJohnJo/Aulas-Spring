package jjj.aulas.springbase.app.controller.view

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class QuizController {

    @GetMapping("")
    fun paginaInicial() = "paginaInicial"

    @GetMapping("/novo")
    fun novoQuiz() = "novoQuiz"

}