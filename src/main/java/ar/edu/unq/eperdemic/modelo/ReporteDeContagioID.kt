package ar.edu.unq.eperdemic.modelo

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
class ReporteDeContagioID(  val nombreDeUbicacion: String,
                            val nombreDelEquipo: String) : Serializable {
}