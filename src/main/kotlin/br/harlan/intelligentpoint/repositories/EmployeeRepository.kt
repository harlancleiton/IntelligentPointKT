package br.harlan.intelligentpoint.repositories

import br.harlan.intelligentpoint.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface EmployeeRepository : MongoRepository<Employee, String> {
    fun findByEmail(email: String): Optional<Employee>

    fun findByCpf(cpf: String): Optional<Employee>
}