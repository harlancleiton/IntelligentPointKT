package br.harlan.intelligentpoint.services

import br.harlan.intelligentpoint.documents.Employee
import java.util.*

interface EmployeeService {
    fun findById(id: String): Optional<Employee>

    fun findByCpf(cpf: String): Optional<Employee>

    fun insert(employee: Employee): Employee
}