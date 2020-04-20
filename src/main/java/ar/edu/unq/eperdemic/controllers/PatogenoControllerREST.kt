package ar.edu.unq.eperdemic.controllers

import ar.edu.unq.eperdemic.modelo.Patogeno
import ar.edu.unq.eperdemic.services.PatogenoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin( origins = ["*"])
@ServiceREST
@RequestMapping("/patogeno")
class PatogenoControllerREST(private val patogenoService: PatogenoService) {

  @PostMapping
  fun create(@RequestBody patogeno: Patogeno): ResponseEntity<Patogeno> {
    return ResponseEntity(patogenoService.crearPatogeno(patogeno), HttpStatus.CREATED)
  }

  @GetMapping
  fun getAll() = patogenoService.recuperarATodosLosPatogenos()



}