package ar.edu.unq.eperdemic.persistencia.dao

import ar.edu.unq.eperdemic.modelo.ReporteDeContagio
import ar.edu.unq.eperdemic.modelo.ReporteDeContagioID
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ReportesRepository : CrudRepository<ReporteDeContagio, ReporteDeContagioID> {
    @Query(value = "SELECT * FROM REPORTE_DE_CONTAGIO ORDER BY VECTORES_INFECTADOS, ESPECIE_MAS_INFECCIOSA DESC LIMIT 10", nativeQuery = true)
    fun getLocacionesLideres(): List<ReporteDeContagio>
}