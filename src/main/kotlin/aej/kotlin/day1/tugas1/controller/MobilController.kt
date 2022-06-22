package aej.kotlin.day1.tugas1.controller

import aej.kotlin.day1.tugas1.model.BaseResponse
import aej.kotlin.day1.tugas1.model.mobil.MobilDatabase
import aej.kotlin.day1.tugas1.model.mobil.MobilRequest
import aej.kotlin.day1.tugas1.service.mobil.MobilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("aej/1/mobil")
class MobilController() {

    @Autowired
    private lateinit var mobilService: MobilService

    @GetMapping
    fun getMobils(): BaseResponse<List<MobilDatabase>> {
        return BaseResponse(
            code = "200",
            message = "berhasil",
            data = mobilService.getAllMobil()
        )
    }

    @PostMapping
    fun addMobil(@RequestBody mobilRequest: MobilRequest): BaseResponse<MobilDatabase> {
        return BaseResponse(
            code = "200",
            message = "insert berhasil",
            data = mobilService.addMobil(mobilRequest)
        )
    }
}