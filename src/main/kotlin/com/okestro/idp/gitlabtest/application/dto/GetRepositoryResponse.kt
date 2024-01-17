package com.okestro.idp.gitlabtest.application.dto

data class GetRepositoryResponse(
    val id: String,
    val name: String,
    val type: String,
    val path: String,
    val mode: String
)
