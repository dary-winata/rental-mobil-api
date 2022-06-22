package aej.kotlin.day1.tugas1.service.mobil

import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest

interface MobilService {
    fun getAllMobil(): List<MobilDatabase>
    fun addMobil(mobilRequest: MobilRequest): MobilDatabase
}