package com.example.health.entity

import jakarta.persistence.*

@Entity
@Table(name = "patients")
class Patients {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
        var id: Long? = null
        var fullName: String? = null
        var email: String? = null

}