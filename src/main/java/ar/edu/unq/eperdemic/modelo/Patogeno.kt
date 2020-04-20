package ar.edu.unq.eperdemic.modelo

import java.io.Serializable
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Patogeno(

        @Id
        @EmbeddedId
        val patogenoId: PatogenoId,
        val tipo: String,
        val cantidadDeEspecies: Int) : Serializable {

}