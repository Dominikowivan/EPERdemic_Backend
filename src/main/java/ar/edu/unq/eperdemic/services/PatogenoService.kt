package ar.edu.unq.eperdemic.services

import ar.edu.unq.eperdemic.modelo.Patogeno


interface PatogenoService {
    fun crearPatogeno(patogeno: Patogeno): Patogeno
    fun recuperarATodosLosPatogenos(): List<Patogeno>
}