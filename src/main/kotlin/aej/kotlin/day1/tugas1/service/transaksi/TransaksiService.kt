package aej.kotlin.day1.tugas1.service.transaksi

import aej.kotlin.day1.tugas1.model.transaksi.TransaksiDatabase
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiRequest

interface TransaksiService {
    suspend fun getAllTransaksi(): List<TransaksiDatabase>
    suspend fun addTransaksi(transaksiRequest: TransaksiRequest): TransaksiDatabase
}