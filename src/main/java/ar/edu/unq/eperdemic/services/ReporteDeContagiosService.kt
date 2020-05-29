package ar.edu.unq.eperdemic.services

import ar.edu.unq.eperdemic.modelo.ReporteDeContagio


interface ReporteDeContagiosService {
    fun updateAll(reportes: List<ReporteDeContagio>)
    fun getLocacionesLideres(): List<ReporteDeContagio>
}