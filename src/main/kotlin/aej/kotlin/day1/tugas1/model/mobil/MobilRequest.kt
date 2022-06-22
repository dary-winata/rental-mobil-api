package aej.kotlin.day1.tugas1.model.mobil

import javax.validation.constraints.NotBlank

data class MobilRequest(
        @field:NotBlank
        val nama: String,

        @field:NotBlank
        val tipe: String,

        @field:NotBlank
        val tahun: String
)
