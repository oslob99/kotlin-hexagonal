package com.okestro.idp.gitlabtest.adapter.out

import com.okestro.idp.common.annotation.ExternalSystemAdapter
import com.okestro.idp.gitlabtest.application.port.out.SaveGitlabTokenPort

@ExternalSystemAdapter
class SaveGitlabTokenAdapter (
): SaveGitlabTokenPort{
    override fun saveToken(token: String): Boolean {
        TODO("Not yet implemented")
    }
}