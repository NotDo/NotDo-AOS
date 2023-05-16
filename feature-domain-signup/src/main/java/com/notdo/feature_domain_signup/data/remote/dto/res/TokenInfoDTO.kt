package com.notdo.feature_domain_signup.data.remote.dto.res

import java.time.LocalDateTime

data class TokenInfoDTO(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: LocalDateTime,
    val refreshExp: LocalDateTime
)
