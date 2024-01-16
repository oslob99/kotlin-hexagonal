package com.okestro.idp.gitlab.adapter.`in`.web

import com.okestro.idp.common.dto.BaseResponse
import com.okestro.idp.gitlab.application.dto.GetRepositoryResponse
import com.okestro.idp.gitlab.application.service.GetRepositoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/gitlab")
class GetRepositoryController(
    private val service: GetRepositoryService,
) {
    @GetMapping("/repo/list")
    fun list():ResponseEntity<BaseResponse<List<GetRepositoryResponse>>> {
        return ResponseEntity.ok().body(service.getRepository())
    }

}
