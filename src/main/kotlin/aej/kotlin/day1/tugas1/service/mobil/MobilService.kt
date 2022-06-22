package aej.kotlin.day1.tugas1.service.mobil

import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest

interface MobilService {
    suspend fun getAllMobil(): List<MobilDatabase>
    suspend fun addMobil(mobilRequest: MobilRequest): MobilDatabase
}