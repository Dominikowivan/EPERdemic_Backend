package ar.edu.unq.eperdemic.modelo

import javax.persistence.*


@Entity
@Table(name= "REPORTE_DE_CONTAGIO")
class ReporteDeContagio(

        @Id
        @EmbeddedId
        val id: ReporteDeContagioID,
        val vectoresPresentes: Int,
        @Column(name = "VECTORES_INFECTADOS")
        val vectoresInfectados: Int,
        val nombreDeEspecieMasInfecciosa: String
) {

}