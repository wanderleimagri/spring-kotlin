package com.example.springkotlin

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AccountRepository : MongoRepository<Account, String> {

    fun findByDocument(document: String): Optional<Account>
}