package com.okestro.idp.gitlabtest.application.port.out

interface SaveGitlabTokenPort {

    fun saveToken(token: String): Boolean
}