package com.gonmunoz.kotlinapi.model

import javax.persistence.*

@Entity
data class Person(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val name: String,
        val lastName: String) {

}