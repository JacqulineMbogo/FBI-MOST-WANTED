package com.example.fbi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FbiMostWantedApplication

fun main(args: Array<String>) {
	runApplication<FbiMostWantedApplication>(*args)
}
