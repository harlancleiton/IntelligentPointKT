package br.harlan.intelligentpoint.services

import br.harlan.intelligentpoint.documents.Company
import java.util.*

interface CompanyService {
    fun findById(id: String): Optional<Company>

    fun findByCnpj(cnpj: String): Optional<Company>

    fun insert(company: Company): Company
}