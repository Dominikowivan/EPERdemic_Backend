package ar.edu.unq.eperdemic.persistencia.dao

import ar.edu.unq.eperdemic.modelo.Patogeno
import ar.edu.unq.eperdemic.modelo.PatogenoId
import org.springframework.data.repository.CrudRepository

interface PatogenoRepository : CrudRepository<Patogeno, PatogenoId> {

}