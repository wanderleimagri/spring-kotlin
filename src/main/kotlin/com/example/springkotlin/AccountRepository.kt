package com.example.springkotlin

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AccountRepository : JpaRepository<Account, Long> {

    fun findByDocument(document: String): Optional<Account>
}