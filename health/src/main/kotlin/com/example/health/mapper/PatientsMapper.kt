package com.example.health.mapper

import com.example.health.dto.PatientsDto
import com.example.health.entity.Patients

object PatientsMapper {
    fun toEntity(patientsDto: PatientsDto): Patients{
        val patients = Patients()
        patients.fullName = patientsDto.fullName
        patients.email = patientsDto.email
        return patients
    }
}
