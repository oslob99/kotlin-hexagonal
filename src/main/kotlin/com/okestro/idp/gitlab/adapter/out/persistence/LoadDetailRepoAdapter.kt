package com.okestro.idp.gitlab.adapter.out.persistence

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.okestro.idp.common.annotation.ExternalSystemAdapter
import com.okestro.idp.common.config.GitlabProperties
import com.okestro.idp.common.config.RestClientConfig
import com.okestro.idp.gitlab.application.port.out.LoadDetailRepoPort
import com.okestro.idp.gitlab.application.port.out.model.LoadDetailRepoResponse

@ExternalSystemAdapter
class LoadDetailRepoAdapter (
    private val mapper: ObjectMapper,
    private val restClientConfig: RestClientConfig,
    private val gitlabProperties: GitlabProperties
): LoadDetailRepoPort {

    override fun loadDetailRepository(repoId: Int): List<LoadDetailRepoResponse> {
        val connectGitLab = restClientConfig.connectGitLab()

        val toEntity = connectGitLab
            .get()
            .uri("/projects/"+ repoId+"/repository/tree")
            .header("PRIVATE-TOKEN", gitlabProperties.token)
            .retrieve()
            .toEntity(String::class.java)

        return mapper.readValue(toEntity.body.toString())
    }

}