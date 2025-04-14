package com.example.fbi.service

import com.example.fbi.model.MostWantedResponse
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class MostWantedService (private val restTemplate: RestTemplate) {
    private val apiUrl = "https://api.fbi.gov/wanted/v1/list"

    fun getWantedList(): MostWantedResponse {
        return restTemplate.getForObject(apiUrl, MostWantedResponse::class.java)
                ?: MostWantedResponse(0, emptyList())
    }
}

