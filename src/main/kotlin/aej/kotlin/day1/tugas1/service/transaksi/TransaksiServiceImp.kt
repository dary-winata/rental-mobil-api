package aej.kotlin.day1.tugas1.service.transaksi

import aej.kotlin.day1.tugas1.model.entitiy.Time
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiDatabase
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiRequest
import aej.kotlin.day1.tugas1.repo.transaksi.TransaksiRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TransaksiServiceImp: TransaksiService {

    @Autowired
    private lateinit var transaksiRepo: TransaksiRepo

    override fun getAllTransaksi(): List<TransaksiDatabase> {
        return transaksiRepo.getTransaksis()
    }

    override fun addTransaksi(transaksiRequest: TransaksiRequest): TransaksiDatabase {
        return transaksiRepo.addTransaksi(transaksiRequest, getTimeNow())
    }

    private fun getTimeNow(): Time {
        val current = LocalDateTime.now()

        return Time(
            current.dayOfMonth,
            current.monthValue,
            current.year
        )
    }
}