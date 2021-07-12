package com.gonmunoz.kotlinapi.controllers

import com.gonmunoz.kotlinapi.model.Person
import com.gonmunoz.kotlinapi.repository.PersonRepository
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("person")
class PersonController(val personRepository: PersonRepository) {

    @GetMapping
    fun findAll(): MutableIterable<Person> = personRepository.findAll()

    @PostMapping
    fun addPerson(@RequestBody person: Person) = personRepository.save(person)

    @PutMapping("/{id}")
    fun updatePerson(@PathVariable id: Long, @RequestBody person: Person){
        assert(person.id == id)
        personRepository.save(person)
    }

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Long) = personRepository.deleteAllById(Collections.singletonList(id))

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = personRepository.findById(id)
}