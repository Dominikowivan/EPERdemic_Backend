package ar.edu.unq.eperdemic.controllers

import ar.edu.unq.eperdemic.controllers.dto.ReporteDeContagiosDTO
import ar.edu.unq.eperdemic.services.ReporteDeContagiosService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@ServiceREST
@RequestMapping("/reportes")
class ReportsControllerREST(private val reportesDeContagioService: ReporteDeContagiosService) {

    @PostMapping
    fun updateReports(@RequestBody reportesDeContagio: List<ReporteDeContagiosDTO>) {
        val reportes = reportesDeContagio.map { r -> r.toModel() }
        reportesDeContagioService.updateAll(reportes)
    }

    @GetMapping
    fun getAll() = reportesDeContagioService.getLocacionesLideres().map { r -> ReporteDeContagiosDTO.from(r) }

}