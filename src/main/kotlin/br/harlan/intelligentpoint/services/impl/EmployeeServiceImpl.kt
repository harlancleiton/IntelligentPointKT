package br.harlan.intelligentpoint.services.impl

import br.harlan.intelligentpoint.documents.Employee
import br.harlan.intelligentpoint.repositories.EmployeeRepository
import br.harlan.intelligentpoint.services.EmployeeService
import br.harlan.intelligentpoint.services.exceptions.ObjectNotFoundException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository) : EmployeeService {
    val logger: Logger = LoggerFactory.getLogger(EmployeeService::class.java)

    override fun findById(id: String): Optional<Employee> {
        logger.info("Find Employee by Id: {}", id)
        val employee: Optional<Employee> = employeeRepository.findById(id)
        if (!employee.isPresent)
            throw ObjectNotFoundException("Employee not found for id " + id)
        return employee
    }

    override fun findByCpf(cpf: String): Optional<Employee> {
        logger.info("Find Employee by CPF: {}", cpf)
        val employee: Optional<Employee> = employeeRepository.findByCpf(cpf)
        if (!employee.isPresent)
            throw ObjectNotFoundException("Employee not found for CPF " + cpf)
        return employee
    }

    override fun insert(employee: Employee): Employee {
        logger.info("Inserting Employee: {}", employee)
        return employeeRepository.save(employee)
    }
}