package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Experience
import com.heesoo.portfolio.domain.entity.Introduction
import com.heesoo.portfolio.domain.entity.Link
import com.heesoo.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository: JpaRepository<Project, Long> {
    


}