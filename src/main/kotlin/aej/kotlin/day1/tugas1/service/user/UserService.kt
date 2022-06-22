package aej.kotlin.day1.tugas1.service.user

import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest

interface UserService {
    fun addUser(userRequest: UserRequest): UserDatabase
    fun getUsers(): List<UserDatabase>
    fun getUserByUsername(username: String): UserDatabase?
}