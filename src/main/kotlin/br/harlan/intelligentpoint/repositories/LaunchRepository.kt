package br.harlan.intelligentpoint.repositories

import br.harlan.intelligentpoint.documents.Launch
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface LaunchRepository : MongoRepository<Launch, String> {
    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Launch>
}