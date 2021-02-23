package com.example.springkotlin

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Account(
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String = "",
    var document: String = "",
    var balance: Long? = 0
)