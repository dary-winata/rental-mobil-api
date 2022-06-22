package aej.kotlin.day1.tugas1.repo.user

import aej.kotlin.day1.tugas1.database.DatabaseComponent
import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest
import com.mongodb.client.MongoCollection
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.litote.kmongo.getCollection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserRepoImp: UserRepo {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun userCollection(): MongoCollection<UserDatabase> =
        databaseComponent.database.getDatabase("aejD1").getCollection()

    override fun getUserByUsername(username: String): UserDatabase? {
        return userCollection().findOne { UserDatabase::username eq username }
    }

    override fun getUsers(): List<UserDatabase> {
        return userCollection().find().toList()
    }

    override fun addUser(userRequest: UserRequest): UserDatabase {
        val userDatabase = UserDatabase(
            id = UUID.randomUUID().toString(),
            name = userRequest.name,
            username = userRequest.username,
            password = userRequest.password
        )

        val insert = userCollection().insertOne(userDatabase)

        return if(insert.wasAcknowledged()){
            userDatabase
        } else{
            throw IllegalStateException("insert gagal")
        }
    }
}