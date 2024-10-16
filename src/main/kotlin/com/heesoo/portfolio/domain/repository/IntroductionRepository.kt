package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Experience
import com.heesoo.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository: JpaRepository<Introduction, Long> {
    


}