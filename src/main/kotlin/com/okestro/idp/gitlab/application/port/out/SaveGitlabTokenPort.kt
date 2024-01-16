package com.okestro.idp.gitlab.application.port.out

interface SaveGitlabTokenPort {

    fun saveToken(token: String): Boolean
}