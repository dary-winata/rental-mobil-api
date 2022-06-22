package aej.kotlin.day1.tugas1.service.user

import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest
import aej.kotlin.day1.tugas1.repo.user.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImp: UserService {

    @Autowired
    private lateinit var userRepo: UserRepo

    override suspend fun addUser(userRequest: UserRequest): UserDatabase {
        return userRepo.addUser(userRequest)
    }

    override suspend fun getUsers(): List<UserDatabase> {
        return userRepo.getUsers()
    }

    override suspend fun getUserByUsername(username: String): UserDatabase? {
        return userRepo.getUserByUsername(username)
    }
}