package com.okestro.idp.gitlab.application.port.`in`.usecase

import com.okestro.idp.common.annotation.UseCase
import com.okestro.idp.gitlab.application.port.out.model.LoadDetailRepoResponse

@UseCase
interface LoadDetailRepoUseCase {
    fun loadDetailRepository(repoId: Int): List<LoadDetailRepoResponse>
}