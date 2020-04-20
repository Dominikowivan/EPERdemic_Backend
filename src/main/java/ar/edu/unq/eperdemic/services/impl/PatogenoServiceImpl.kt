package ar.edu.unq.eperdemic.services.impl

import ar.edu.unq.eperdemic.modelo.Patogeno
import ar.edu.unq.eperdemic.persistencia.dao.PatogenoRepository
import ar.edu.unq.eperdemic.services.PatogenoService
import org.springframework.stereotype.Service


@Service
class PatogenoServiceImpl(val patogenoDAO: PatogenoRepository) : PatogenoService {

    override fun crearPatogeno(patogeno: Patogeno): Patogeno {
        return patogenoDAO.save(patogeno)
    }

    override fun recuperarATodosLosPatogenos(): List<Patogeno> = patogenoDAO.findAll().toList()

}