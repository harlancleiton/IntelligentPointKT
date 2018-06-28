package br.harlan.intelligentpoint.repositories

import br.harlan.intelligentpoint.documents.Launch
import org.springframework.data.mongodb.repository.MongoRepository

interface LaunchRepository : MongoRepository<Launch, String> {
    //fun findByEmplooyeId(employeeId: String, pageable: Pageable): Page<Launch>
}