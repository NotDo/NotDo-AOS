package com.notdo.feature_domain_signup.domain.model.req

data class UserAccountInfoModel(
    val email: String,
    val password: String,
    val nickname: String
)
