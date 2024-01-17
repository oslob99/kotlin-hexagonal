package com.okestro.idp.gitlab.application.port.`in`.usecase

import com.okestro.idp.common.annotation.UseCase

@UseCase
interface LoadCommitList {

    fun loadCommitList()
}