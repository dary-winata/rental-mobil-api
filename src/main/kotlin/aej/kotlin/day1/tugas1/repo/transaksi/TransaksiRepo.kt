package aej.kotlin.day1.tugas1.repo.transaksi

import aej.kotlin.day1.tugas1.model.entitiy.Time
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiDatabase
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiRequest
import java.util.Date

interface TransaksiRepo {
    fun getTransaksis(): List<TransaksiDatabase>
    fun addTransaksi(transaksiRequest: TransaksiRequest, timeNow: Time): TransaksiDatabase
}