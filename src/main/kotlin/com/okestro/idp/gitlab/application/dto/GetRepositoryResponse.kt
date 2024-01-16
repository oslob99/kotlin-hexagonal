package com.okestro.idp.gitlab.application.dto

data class GetRepositoryResponse(
    val id: String,
    val name: String,
    val type: String,
    val path: String,
    val mode: String
)
