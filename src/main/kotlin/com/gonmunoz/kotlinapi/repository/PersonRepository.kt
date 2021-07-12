package com.gonmunoz.kotlinapi.repository

import com.gonmunoz.kotlinapi.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Long> {
}