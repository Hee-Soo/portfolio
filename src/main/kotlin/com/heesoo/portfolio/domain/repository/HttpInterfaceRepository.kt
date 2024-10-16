package com.heesoo.portfolio.domain.repository


import com.heesoo.portfolio.domain.entity.Experience
import com.heesoo.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {
    


}