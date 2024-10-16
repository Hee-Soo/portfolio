package com.heesoo.portfolio.domain.entity

import BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Introduction(
        content: String,
        isActive: Boolean
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column  (name = "experience_id")

    var id: Long? = null

    var content: String = content

    var isActive: Boolean = isActive

}