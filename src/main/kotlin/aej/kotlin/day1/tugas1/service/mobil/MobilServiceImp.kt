package aej.kotlin.day1.tugas1.service.mobil

import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest
import aej.kotlin.day1.tugas1.repo.mobil.MobilRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MobilServiceImp: MobilService {

    @Autowired
    private lateinit var mobilRepo: MobilRepo

    override suspend fun getAllMobil(): List<MobilDatabase> {
        return mobilRepo.getMobils()
    }

    override suspend fun addMobil(mobilRequest: MobilRequest): MobilDatabase {
        return mobilRepo.addMobil(mobilRequest)
    }
}