package aej.kotlin.day1.tugas1.repo.mobil

import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest

interface MobilRepo {
    fun getMobils(): List<MobilDatabase>
    fun addMobil(mobilParams: MobilRequest): MobilDatabase
    fun getMobilByName(name: String): MobilDatabase?
}