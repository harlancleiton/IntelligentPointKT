package br.harlan.intelligentpoint.services

import br.harlan.intelligentpoint.documents.Company
import br.harlan.intelligentpoint.repositories.CompanyRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest
class CompanyServiceTest {
    @Autowired
    val companyService: CompanyService? = null

    @MockBean
    private val companyRepository: CompanyRepository? = null

    private val SOCIAL_NAME = "Social Name"
    private val CNPJ = "123"
    private val ID = "1"

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(companyRepository?.findByCnpj(CNPJ)).willReturn(Optional.ofNullable(company()))
        BDDMockito.given(companyRepository?.findById(ID)).willReturn(Optional.ofNullable(company()))
        BDDMockito.given(companyRepository?.save(company())).willReturn(company())
    }

    @Test
    fun testFindByCnpj() {
        val optional: Optional<Company>? = companyService?.findByCnpj(CNPJ)
        val company: Company? = optional!!.get()
        Assert.assertNotNull(company)
    }

    @Test
    fun testFindById() {
        val optional: Optional<Company>? = companyService?.findById(ID)
        val company: Company? = optional!!.get()
        Assert.assertNotNull(company)
    }

    @Test
    fun testInsert() {
        val company: Company? = companyService?.insert(company())
        Assert.assertNotNull(company)
    }

    private fun company(): Company = Company(SOCIAL_NAME, CNPJ, ID)
}