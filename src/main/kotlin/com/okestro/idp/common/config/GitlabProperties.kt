package com.okestro.idp.common.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "gitlab-open-api")
data class GitlabProperties (
    var token: String,
    var url: String
)