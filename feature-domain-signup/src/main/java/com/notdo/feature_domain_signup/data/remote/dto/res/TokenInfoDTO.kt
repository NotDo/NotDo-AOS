package com.notdo.feature_domain_signup.data.remote.dto.res

import com.notdo.feature_domain_signup.domain.model.res.TokenInfoModel
import java.time.LocalDateTime

data class TokenInfoDTO(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: LocalDateTime,
    val refreshExp: LocalDateTime
)

fun TokenInfoDTO.toModel() =
    TokenInfoModel(
        accessToken = this.accessToken,
        refreshToken = this.refreshToken,
        accessExp = this.accessExp,
        refreshExp = this.refreshExp
    )
