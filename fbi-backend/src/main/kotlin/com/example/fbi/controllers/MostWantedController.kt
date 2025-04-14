package com.example.fbi.controller


import com.example.fbi.model.MostWantedResponse
import com.example.fbi.service.MostWantedService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/wanted")
@CrossOrigin(origins = ["http://localhost:3000"])
class MostWantedController(private val fbiService: MostWantedService) {

    @GetMapping
    fun getAll(): MostWantedResponse = fbiService.getWantedList()
}
