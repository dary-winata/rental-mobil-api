package aej.kotlin.day1.tugas1.controller

import aej.kotlin.day1.tugas1.model.BaseResponse
import aej.kotlin.day1.tugas1.model.user.UserDatabase
import aej.kotlin.day1.tugas1.model.user.UserRequest
import aej.kotlin.day1.tugas1.service.user.UserService
import com.fasterxml.jackson.databind.ser.Serializers.Base
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("aej/1/user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @PostMapping
    fun addUser(@RequestBody userRequest: UserRequest): BaseResponse<UserDatabase> {
        return BaseResponse(
            code = "200",
            message = "Data berhasil Diambil",
            data = userService.addUser(userRequest)
        )
    }

    @GetMapping
    fun getUsers(): BaseResponse<List<UserDatabase>> {
        return BaseResponse(
            code = "200",
            message = "Data Berhasil Diambil",
            data = userService.getUsers()
        )
    }

    @GetMapping("/{username}")
    fun getUserByUsername(@PathVariable username: String): BaseResponse<UserDatabase> {
        return BaseResponse(
            code = "200",
            message = "Data Berhasil Diambil",
            data = userService.getUserByUsername(username)
        )
    }
}