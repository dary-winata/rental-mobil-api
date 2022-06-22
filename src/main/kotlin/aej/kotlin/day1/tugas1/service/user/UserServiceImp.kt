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

    override fun addUser(userRequest: UserRequest): UserDatabase {
        return userRepo.addUser(userRequest)
    }

    override fun getUsers(): List<UserDatabase> {
        return userRepo.getUsers()
    }

    override fun getUserByUsername(username: String): UserDatabase? {
        return userRepo.getUserByUsername(username)
    }
}