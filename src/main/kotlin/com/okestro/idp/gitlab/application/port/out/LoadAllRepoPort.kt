package com.okestro.idp.gitlab.application.port.out

import com.okestro.idp.gitlab.application.port.out.model.LoadAllRepoResponse


interface LoadAllRepoPort {

    fun loadAllRepoList(): List<LoadAllRepoResponse>
}