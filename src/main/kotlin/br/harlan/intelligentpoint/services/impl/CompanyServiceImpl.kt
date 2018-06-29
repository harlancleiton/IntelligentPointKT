package br.harlan.intelligentpoint.services.impl

import br.harlan.intelligentpoint.documents.Company
import br.harlan.intelligentpoint.repositories.CompanyRepository
import br.harlan.intelligentpoint.services.CompanyService
import br.harlan.intelligentpoint.services.exceptions.ObjectNotFoundException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class CompanyServiceImpl(val companyRepository: CompanyRepository) : CompanyService {
    val logger: Logger = LoggerFactory.getLogger(CompanyService::class.java)

    override fun findById(id: String): Optional<Company> {
        logger.info("Find Company by Id: {}", id)
        val company: Optional<Company> = companyRepository.findById(id)
        if (!company.isPresent)
            throw ObjectNotFoundException("Company not found for id " + id)
        return company
    }

    override fun findByCnpj(cnpj: String): Optional<Company> {
        logger.info("Find Company by CNPJ: {}", cnpj)
        return companyRepository.findByCnpj(cnpj);
    }

    override fun insert(company: Company): Company {
        logger.info("Inserting Company: {}", company)
        return companyRepository.save(company)
    }
}