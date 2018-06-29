package br.harlan.intelligentpoint.services

import br.harlan.intelligentpoint.documents.Launch
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.*

interface LaunchService {
    fun findById(id: String): Optional<Launch>

    fun findByEmplooyeId(employeeId: String, pageable: Pageable): Page<Launch>

    fun insert(launch: Launch): Launch
}