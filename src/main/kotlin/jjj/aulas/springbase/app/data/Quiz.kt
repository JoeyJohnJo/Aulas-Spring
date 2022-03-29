package jjj.aulas.springbase.app.data

import java.time.LocalDate.now
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity // Indica que esta classe está vinculada a uma tabela do banco de dados
@Table(name = "quiz") // Indica qual o nome da tabela que está vinculada a esta classe
@SequenceGenerator(name = "quiz_id_seq", sequenceName = "quiz_id_seq", allocationSize = 1) // Indica qual o nome da sequência que está vinculada a esta classe
class Quiz (

    @Id // Indica que este atributo é a chave primária da tabela
    @NotNull // Indica que este atributo não pode ser nulo
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quiz_id_seq") // Indica que este atributo é gerado automaticamente
    var id: Long = 0,

    @NotNull // Indica que este atributo não pode ser nulo
    @Column(name = "name") // Indica qual o nome da coluna que está vinculada a este atributo
    var name: String = "",

    @Column(name = "teacher") // Indica qual o nome da coluna que está vinculada a este atributo
    var teacher: String = "",

    @Column(name = "year") // Indica qual o nome da coluna que está vinculada a este atributo
    var year: Int = now().year,

    @Column(name = "semestre") // Indica qual o nome da coluna que está vinculada a este atributo
    var semestre: Int = 1,
)
