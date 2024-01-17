package com.okestro.idp.gitlab.application.service

import com.okestro.idp.gitlab.application.port.`in`.usecase.LoadAllRepoUseCase
import com.okestro.idp.gitlab.application.port.out.LoadAllRepoPort
import com.okestro.idp.gitlab.application.port.out.model.LoadAllRepoResponse
import org.springframework.stereotype.Service

@Service
class LoadAllRepoService (
    private val loadAllRepoPort: LoadAllRepoPort
) : LoadAllRepoUseCase {
    override fun loadAllRepoList(): List<LoadAllRepoResponse> =
        loadAllRepoPort.loadAllRepoList()

}