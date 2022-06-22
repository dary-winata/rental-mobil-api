package aej.kotlin.day1.tugas1.repo.user

import aej.kotlin.day1.tugas1.model.entitiy.Time
import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest

interface UserRepo {
    fun getUserByUsername(username: String): UserDatabase?
    fun getUsers(): List<UserDatabase>
    fun addUser(userRequest: UserRequest): UserDatabase
}