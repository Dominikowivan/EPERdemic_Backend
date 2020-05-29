package ar.edu.unq.eperdemic.services.impl

import ar.edu.unq.eperdemic.modelo.ReporteDeContagio
import ar.edu.unq.eperdemic.persistencia.dao.ReportesRepository
import ar.edu.unq.eperdemic.services.ReporteDeContagiosService
import org.springframework.stereotype.Service


@Service
class ReporteDeContagiosServiceImpl(val reportesDAO: ReportesRepository) : ReporteDeContagiosService {
    override fun getLocacionesLideres(): List<ReporteDeContagio> {
      return  reportesDAO.getLocacionesLideres()
    }

    override fun updateAll(reportes: List<ReporteDeContagio>) {
        reportesDAO.saveAll(reportes)
    }


}