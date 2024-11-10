package com.example.health.service

import com.example.health.dto.PatientsDto
import com.example.health.entity.Patients
import com.example.health.mapper.PatientsMapper
import com.example.health.repository.PatientsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PatientsService {
    @Autowired
    lateinit var patientsRepository: PatientsRepository

    fun getPatients(): List<Patients> {
        return patientsRepository.findAll()
    }

    fun save(patientsDto: PatientsDto): Patients{
        val patients = PatientsMapper.toEntity(patientsDto)
        return patientsRepository.save(patients)
    }
}