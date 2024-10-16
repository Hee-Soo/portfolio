package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository: JpaRepository<Experience, Long> {
    


}