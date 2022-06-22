package aej.kotlin.day1.tugas1.model.user

import javax.validation.constraints.NotBlank

data class UserDatabase(
    val id: String,
    val name: String,
    val username: String,
    val password: String
)
