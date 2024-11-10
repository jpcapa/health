package com.example.health.controller

import com.example.health.dto.PatientsDto
import com.example.health.response.JSendResponse
import com.example.health.service.PatientsService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/patients")
class PatientsController {
    @Autowired
    lateinit var patientsService: PatientsService

    @GetMapping
    fun getPatients(): ResponseEntity<*> {
        return try {
            ResponseEntity.ok(JSendResponse.success(data = patientsService.getPatients(), message = "Success", code = 200))
        } catch (e: Exception) {
            ResponseEntity(
                JSendResponse.error(
                    message = "Error al obtener los sistemas",
                ),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }
    @PostMapping
    fun save(@RequestBody @Valid patientsDto: PatientsDto):ResponseEntity<Any>{
        val patients =  patientsService.save(patientsDto)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(mapOf("status" to "success", "data" to patients, "message" to "User created successfully"))
    }
}