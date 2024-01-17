package com.okestro.idp.gitlabtest.application.service

import com.okestro.idp.gitlabtest.application.port.`in`.usecase.SaveGitlabTokenUseCase
import com.okestro.idp.gitlabtest.application.port.out.SaveGitlabTokenPort
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