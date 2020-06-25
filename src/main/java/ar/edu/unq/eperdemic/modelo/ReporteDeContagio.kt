package ar.edu.unq.eperdemic.modelo

import javax.persistence.*


@Entity
@Table(name= "REPORTE_DE_CONTAGIO")
class ReporteDeContagio(

        @Id
        @EmbeddedId
        val id: ReporteDeContagioID,
        @Column(name = "VECTORES_PRESENTES")
        val vectoresPresentes: Int,
        @Column(name = "VECTORES_INFECTADOS")
        val vectoresInfectados: Int,
        @Column(name = "ESPECIE_MAS_INFECCIOSA")
        val nombreDeEspecieMasInfecciosa: String
) {

}