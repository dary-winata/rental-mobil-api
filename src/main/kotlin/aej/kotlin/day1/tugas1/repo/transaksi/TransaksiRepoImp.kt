package aej.kotlin.day1.tugas1.repo.transaksi

import aej.kotlin.day1.tugas1.database.DatabaseComponent
import aej.kotlin.day1.tugas1.model.entitiy.Time
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiDatabase
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiRequest
import com.mongodb.client.MongoClient
import org.litote.kmongo.getCollection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class TransaksiRepoImp: TransaksiRepo {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    fun transaksiCollection() =
        databaseComponent.database.getDatabase("aejD1").getCollection<TransaksiDatabase>()

    suspend override fun getTransaksis(): List<TransaksiDatabase> {
        return transaksiCollection().find().toList()
    }

    suspend override fun addTransaksi(transaksiRequest: TransaksiRequest, timeNow: Time): TransaksiDatabase {
        val transaksiDatabase = TransaksiDatabase(
            id = UUID.randomUUID().toString(),
            userId = transaksiRequest.userId,
            waktuPinjam = timeNow,
            waktuPengembalian = transaksiRequest.waktuPengembalian,
            listMobil = transaksiRequest.listMobil,
            createdAt = timeNow,
            editedAt = null
        )
        val execute = transaksiCollection().insertOne(transaksiDatabase)

        return if(execute.wasAcknowledged()){
            transaksiDatabase
        } else{
            throw IllegalStateException("Data Gagal Diinput!!!")
        }
    }
}