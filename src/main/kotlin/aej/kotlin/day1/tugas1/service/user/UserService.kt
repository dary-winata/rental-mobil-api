package aej.kotlin.day1.tugas1.service.user

import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest

interface UserService {
    suspend fun addUser(userRequest: UserRequest): UserDatabase
    suspend fun getUsers(): List<UserDatabase>
    suspend fun getUserByUsername(username: String): UserDatabase?
}