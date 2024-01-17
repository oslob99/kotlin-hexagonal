package com.okestro.idp.gitlab.application.port.`in`.usecase

import com.okestro.idp.common.annotation.UseCase
import com.okestro.idp.gitlab.application.port.out.model.LoadAllRepoResponse

@UseCase
interface LoadAllRepoUseCase {

    fun loadAllRepoList(): List<LoadAllRepoResponse>
}