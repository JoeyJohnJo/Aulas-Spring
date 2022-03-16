package jjj.aulas.springbase

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {

    @GetMapping("")
    fun infoInicial() = "Hello, world!"
}