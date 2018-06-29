package br.harlan.intelligentpoint.dtos

import org.hibernate.validator.constraints.Length
import java.util.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class EmployeeDTO(
        @get:NotEmpty(message = "Nome não deve ser vazio")
        @get:Length(message = "Nome deve conter entre 3 e 150 caracteres", min = 3, max = 150)
        val name: String = "",
        @get:Email(message = "Email inválido")
        val email: String = "",
        val password: Optional<String> = Optional.empty(),
        var id: String? = null
) {
    override fun toString(): String {
        return "EmployeeDTO(" +
                "name='$name'," +
                "email='$email'," +
                "password=$password," +
                "id=$id" +
                ")"
    }
}