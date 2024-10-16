package com.heesoo.portfolio.domain.repository

import com.heesoo.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository: JpaRepository<Achievement, Long> {



}