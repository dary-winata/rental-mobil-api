package aej.kotlin.day1.tugas1.database

import com.mongodb.client.MongoClient
import org.litote.kmongo.KMongo
import org.springframework.stereotype.Component

@Component
class DatabaseComponent {
    companion object {
        private const val MONGO_URL = ""
    }

    val database: MongoClient = KMongo.createClient(MONGO_URL)
}
