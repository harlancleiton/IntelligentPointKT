package br.harlan.intelligentpoint.documents

import br.harlan.intelligentpoint.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee(
        val name: String,
        val email: String,
        val password: String,
        val cpf: String,
        val rg: String,
        val profiles: Set<ProfileEnum> = HashSet(),
        val companyId: String,
        @Id val id: String? = null
)