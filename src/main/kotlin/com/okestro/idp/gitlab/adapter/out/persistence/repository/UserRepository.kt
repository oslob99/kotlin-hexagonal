package com.okestro.idp.gitlab.adapter.out.persistence.repository

import com.okestro.idp.gitlab.adapter.out.persistence.entity.UserJpaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserJpaEntity, Long> {
}