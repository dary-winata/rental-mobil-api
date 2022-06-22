package aej.kotlin.day1.tugas1.repo.mobil

import aej.kotlin.day1.tugas1.database.DatabaseComponent
import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest
import com.mongodb.client.MongoCollection
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.litote.kmongo.getCollection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class MobilRepoImp: MobilRepo {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun mobilCollection(): MongoCollection<MobilDatabase> =
        databaseComponent.database.getDatabase("aejD1").getCollection()

    override suspend fun getMobils(): List<MobilDatabase> {
        return mobilCollection().find().toList()
    }

    override suspend fun addMobil(mobilParams: MobilRequest): MobilDatabase {
        val mobil = MobilDatabase(
            id = UUID.randomUUID().toString(),
            name = mobilParams.nama,
            tipe = mobilParams.tipe,
            tahun = mobilParams.tahun
        )

        val insert = mobilCollection().insertOne(mobil)

        return if(insert.wasAcknowledged()) {
            mobil
        } else {
            throw IllegalStateException("insert gagal")
        }
    }

    override suspend fun getMobilByName(name: String): MobilDatabase? {
        return mobilCollection().findOne { MobilDatabase::name eq name}
    }
}