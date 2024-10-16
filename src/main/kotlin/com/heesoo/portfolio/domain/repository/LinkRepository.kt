package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Experience
import com.heesoo.portfolio.domain.entity.Introduction
import com.heesoo.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository: JpaRepository<Link, Long> {
    


}