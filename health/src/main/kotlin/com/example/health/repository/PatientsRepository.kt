package com.example.health.repository

import com.example.health.entity.Patients
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PatientsRepository: JpaRepository<Patients, Long> {
}