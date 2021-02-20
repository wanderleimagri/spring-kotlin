package com.example.springkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankaccountApplication

fun main(args: Array<String>) {
	runApplication<BankaccountApplication>(*args)
}
