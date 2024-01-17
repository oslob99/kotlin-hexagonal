package com.okestro.idp.gitlabtest.application.port.`in`.usecase

import com.okestro.idp.common.annotation.UseCase

@UseCase
interface SaveGitlabTokenUseCase {

    fun saveToken(token: String ): Boolean
}