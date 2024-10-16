package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository: JpaRepository<ProjectSkill, Long> {
    


}