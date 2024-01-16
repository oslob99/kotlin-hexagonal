package com.okestro.idp.gitlab.application.service

import com.okestro.idp.gitlab.application.port.`in`.usecase.SaveGitlabTokenUseCase
import com.okestro.idp.gitlab.application.port.out.SaveGitlabTokenPort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class SaveTokenService (
    private val saveGitlabTokenPort: SaveGitlabTokenPort
) : SaveGitlabTokenUseCase{
    override fun saveToken(token: String) =
        saveGitlabTokenPort.saveToken(token)


}