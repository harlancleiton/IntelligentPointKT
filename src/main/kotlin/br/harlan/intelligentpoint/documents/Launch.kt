package br.harlan.intelligentpoint.documents

import br.harlan.intelligentpoint.enums.LaunchTypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Launch(
        val date: Date,
        val type: LaunchTypeEnum,
        val employeeId: String,
        val description: String?,
        val location: String?,
        @Id val id: String? = null
)