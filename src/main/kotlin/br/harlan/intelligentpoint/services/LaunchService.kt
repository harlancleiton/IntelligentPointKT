package br.harlan.intelligentpoint.services

import br.harlan.intelligentpoint.documents.Launch
import java.util.*

interface LaunchService {
    fun findById(id: String): Optional<Launch>

    fun insert(launch: Launch): Launch
}