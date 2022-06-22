package aej.kotlin.day1.tugas1.repo.mobil

import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest

interface MobilRepo {
    suspend fun getMobils(): List<MobilDatabase>
    suspend fun addMobil(mobilParams: MobilRequest): MobilDatabase
    suspend fun getMobilByName(name: String): MobilDatabase?
}