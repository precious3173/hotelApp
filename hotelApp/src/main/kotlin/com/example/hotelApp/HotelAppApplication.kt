package com.example.hotelApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HotelAppApplication

fun main(args: Array<String>) {
	runApplication<HotelAppApplication>(*args)
}
