package com.okestro.idp.gitlabtest.application.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.okestro.idp.common.config.GitlabProperties
import com.okestro.idp.common.config.RestClientConfig
import com.okestro.idp.common.dto.BaseResponse
import com.okestro.idp.gitlabtest.application.dto.GetRepositoryResponse
import org.springframework.stereotype.Service

@Service
class GetRepositoryService(
    private val gitlabProperties: GitlabProperties,
    private val restClientConfig: RestClientConfig,
    private val mapper: ObjectMapper
) {


    fun getRepository():List<GetRepositoryResponse>{

        val connectGitLab = restClientConfig.connectGitLab()

        val toEntity = connectGitLab
            .get()
            .uri("/projects/53145568/repository/tree")
            .header("PRIVATE-TOKEN", gitlabProperties.token)
            .retrieve()
            .toEntity(String::class.java)

        val gitlabApiResponseList: List<GetRepositoryResponse> =
            mapper.readValue(toEntity.body.toString())

        return gitlabApiResponseList

    }

}
