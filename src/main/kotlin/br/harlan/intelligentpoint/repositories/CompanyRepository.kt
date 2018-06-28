package br.harlan.intelligentpoint.repositories

import br.harlan.intelligentpoint.documents.Company
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface CompanyRepository : MongoRepository<Company, String> {
    fun findByCnpj(cnpj: String): Optional<Company>
}