package br.harlan.intelligentpoint.repositories

import br.harlan.intelligentpoint.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {
    fun findByEmail(email: String): Employee

    fun findByCpf(cpf: String): Employee
}