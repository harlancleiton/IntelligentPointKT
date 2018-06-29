package br.harlan.intelligentpoint.services.impl

import br.harlan.intelligentpoint.documents.Launch
import br.harlan.intelligentpoint.repositories.LaunchRepository
import br.harlan.intelligentpoint.services.LaunchService
import br.harlan.intelligentpoint.services.exceptions.ObjectNotFoundException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class LaunchServiceImpl(val launchRepository: LaunchRepository) : LaunchService {

    val logger: Logger = LoggerFactory.getLogger(LaunchService::class.java)

    override fun findById(id: String): Optional<Launch> {
        logger.info("Find Launch by Id: {}", id)
        val launch: Optional<Launch> = launchRepository.findById(id)
        if (!launch.isPresent)
            throw ObjectNotFoundException("Launch not found for id " + id)
        return launch
    }

    override fun findByEmplooyeId(employeeId: String, pageable: Pageable): Page<Launch> {
        logger.info("Find Launch by Page: {} and EmployeeId: {}", pageable, employeeId)
        val page: Page<Launch> = launchRepository.findByEmplooyeId(employeeId, pageable)
        return page
    }

    override fun insert(launch: Launch): Launch {
        logger.info("Inserting Launch: {}", launch)
        return launchRepository.save(launch)
    }
}