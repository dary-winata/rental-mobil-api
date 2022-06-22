package aej.kotlin.day1.tugas1.model.transaksi

import aej.kotlin.day1.tugas1.model.entitiy.Time
import javax.validation.constraints.NotBlank

data class TransaksiRequest(
    @field:NotBlank
    val userId: String,
    @field:NotBlank
    val waktuPengembalian: Time,
    @field:NotBlank
    val listMobil: MutableList<String>,
)
