package br.harlan.intelligentpoint

import br.harlan.intelligentpoint.documents.Company
import br.harlan.intelligentpoint.documents.Employee
import br.harlan.intelligentpoint.enums.ProfileEnum
import br.harlan.intelligentpoint.repositories.CompanyRepository
import br.harlan.intelligentpoint.repositories.EmployeeRepository
import br.harlan.intelligentpoint.repositories.LaunchRepository
import br.harlan.intelligentpoint.utils.PasswordUtil
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntelligentPointApplication(val companyRepository: CompanyRepository,
                                  val employeeRepository: EmployeeRepository,
                                  val launchRepository: LaunchRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        companyRepository.deleteAll()
        employeeRepository.deleteAll()
        launchRepository.deleteAll()

        val company: Company = Company("Company", "10443887000146")
        companyRepository.save(company)

        val profileAdmin: Set<ProfileEnum> = setOf(ProfileEnum.ROLE_USER, ProfileEnum.ROLE_ADMIN)
        val admin: Employee = Employee("Admin", "admin@company.com",
                PasswordUtil.encoder("123456"), "25708317000", "123", profileAdmin, company.id!!)
        employeeRepository.save(admin)

        val profileUser: Set<ProfileEnum> = setOf(ProfileEnum.ROLE_USER, ProfileEnum.ROLE_ADMIN)
        val employee: Employee = Employee("Employee",
                "employee@company.com", PasswordUtil.encoder("123456"),
                "44325441557", "123", profileUser, company.id)
        employeeRepository.save(employee)

        System.out.println("Company ID: " + company.id)
        System.out.println("Admin ID: " + admin.id)
        System.out.println("Employee ID: " + employee.id)
    }
}

fun main(args: Array<String>) {
    runApplication<IntelligentPointApplication>(*args)
}
