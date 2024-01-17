package com.okestro.idp.gitlabtest.adapter.out.persistence.repository

import com.okestro.idp.gitlabtest.adapter.out.persistence.entity.UserJpaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserJpaEntity, Long> {
}