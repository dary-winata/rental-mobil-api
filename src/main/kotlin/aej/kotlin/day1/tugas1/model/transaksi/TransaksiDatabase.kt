package aej.kotlin.day1.tugas1.model.transaksi

import aej.kotlin.day1.tugas1.model.entitiy.Time
import java.util.*
import javax.validation.constraints.NotBlank

data class TransaksiDatabase(
    val id: String,
    val userId: String,
    val waktuPinjam: Time,
    val waktuPengembalian: Time,
    val listMobil: MutableList<String>,
    val createdAt: Time,
    val editedAt: Time?
)
