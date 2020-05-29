package ar.edu.unq.eperdemic.controllers.dto

import ar.edu.unq.eperdemic.modelo.ReporteDeContagio
import ar.edu.unq.eperdemic.modelo.ReporteDeContagioID


class ReporteDeContagiosDTO(val vectoresPresentes:Int,
                            val vectoresInfecatods:Int,
                            val nombreDeEspecieMasInfecciosa: String,
                            val nombreDeUbicacion: String,
                            val nombreDelEquipo: String) {
    fun toModel(): ReporteDeContagio {
        return ReporteDeContagio(ReporteDeContagioID(nombreDeUbicacion,nombreDelEquipo),  vectoresPresentes, vectoresInfecatods, nombreDeEspecieMasInfecciosa)
    }

    companion object {
        fun from(reporte: ReporteDeContagio) =
                ReporteDeContagiosDTO(
                        reporte.vectoresPresentes,
                        reporte.vectoresInfectados,
                        reporte.nombreDeEspecieMasInfecciosa,
                        reporte.id.nombreDeUbicacion,
                        reporte.id.nombreDelEquipo
                )
    }

}