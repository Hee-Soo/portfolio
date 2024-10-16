package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {


}