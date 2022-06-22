package aej.kotlin.day1.tugas1.controller

import aej.kotlin.day1.tugas1.model.BaseResponse
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiDatabase
import aej.kotlin.day1.tugas1.model.transaksi.TransaksiRequest
import aej.kotlin.day1.tugas1.service.transaksi.TransaksiService
import com.fasterxml.jackson.databind.ser.Serializers.Base
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aej/1/transaksi")
class TransaksiController {
    @Autowired
    private lateinit var transaksiService: TransaksiService

    @GetMapping
    fun getAllTransaksi(): BaseResponse<List<TransaksiDatabase>> {
        return BaseResponse(
            code = "200",
            message = "data berhasil diambil",
            data = transaksiService.getAllTransaksi()
        )
    }

    @PostMapping
    fun addTransaksi(@RequestBody transaksiRequest: TransaksiRequest): BaseResponse<TransaksiDatabase> {
        return BaseResponse(
            code = "200",
            message = "data berhasil di input",
            data = transaksiService.addTransaksi(transaksiRequest)
        )
    }
}