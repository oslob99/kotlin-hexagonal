package com.okestro.idp.gitlabtest.adapter.`in`.web

import com.okestro.idp.gitlabtest.application.port.`in`.usecase.SaveGitlabTokenUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/gitlab")
class SaveGitlabTokenController (
    val saveGitlabTokenUseCase: SaveGitlabTokenUseCase
){

    @PostMapping("/token")
    fun saveToken(
        @RequestParam("token") token: String
    ): ResponseEntity<Boolean> {
        return ResponseEntity.ok().body(saveGitlabTokenUseCase.saveToken(token))
    }
}