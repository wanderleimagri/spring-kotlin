package com.example.springkotlin

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("accounts")
class AccountController(val repository: AccountRepository) {

    @PostMapping
    fun create(@RequestBody account: Account) = ResponseEntity.ok(repository.save(account))

    @GetMapping
    fun read() = ResponseEntity.ok(repository.findAll())

    @PutMapping("{document}")
    fun update(@PathVariable document: String, @RequestBody account: Account): ResponseEntity<Account> {
        val accountDBOptional = repository.findByDocument(document)
        val accountToSave = accountDBOptional
                .orElseThrow() { RuntimeException("Account document: $document not found") }
                .copy(name = account.name, balance = account.balance)
        return ResponseEntity.ok(repository.save(accountToSave))
    }

    @DeleteMapping("{document}")
    fun delete(@PathVariable document:String) = repository
            .findByDocument(document)
            .ifPresent {repository.delete(it)}
}