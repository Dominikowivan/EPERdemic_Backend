package ar.edu.unq.eperdemic.modelo

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
class PatogenoId(
        val groupName : String,
        val id : Int)  : Serializable {

}