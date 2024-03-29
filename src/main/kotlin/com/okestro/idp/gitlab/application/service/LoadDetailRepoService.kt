package com.okestro.idp.gitlab.application.service

import com.okestro.idp.gitlab.application.port.`in`.usecase.LoadDetailRepoUseCase
import com.okestro.idp.gitlab.application.port.out.LoadDetailRepoPort
import com.okestro.idp.gitlab.application.port.out.model.LoadDetailRepoResponse
import org.springframework.stereotype.Service

@Service
class LoadDetailRepoService (
    private val loadDetailRepoPort: LoadDetailRepoPort
): LoadDetailRepoUseCase {
    override fun loadDetailRepository(repoId: Int): List<LoadDetailRepoResponse> =
        loadDetailRepoPort.loadDetailRepository(repoId)

}