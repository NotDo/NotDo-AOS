package com.notdo.feature_domain_signup.domain.model.res

import java.time.LocalDateTime

data class TokenInfoModel(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: LocalDateTime,
    val refreshExp: LocalDateTime
)
