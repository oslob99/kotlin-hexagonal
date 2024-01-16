package com.okestro.idp.gitlab.application.port.`in`.usecase

import com.okestro.idp.common.annotation.UseCase

@UseCase
interface saveGitlabToken {

    fun saveGitlabToken(): Boolean
}