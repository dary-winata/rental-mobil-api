package aej.kotlin.day1.tugas1.model.user

import javax.validation.constraints.NotBlank

data class UserRequest(
    @field:NotBlank
    val name: String,
    @field:NotBlank
    val username: String,
    @field:NotBlank
    val password: String
)
