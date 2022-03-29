package jjj.aulas.springbase.app.data

import org.springframework.data.jpa.repository.JpaRepository

interface QuizRepository : JpaRepository<Quiz, Long>