package com.example.health.dto

import jakarta.validation.constraints.NotBlank

class PatientsDto {
    @NotBlank(message = "Name cannot be blank")
    var fullName: String? = ""
    @NotBlank(message = "Name cannot be blank")
    var email: String? = ""
}