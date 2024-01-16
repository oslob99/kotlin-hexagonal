package com.okestro.idp

import com.okestro.idp.common.config.GitlabProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(GitlabProperties::class)
class IdpApplication

fun main(args: Array<String>) {
    runApplication<IdpApplication>(*args)
}
