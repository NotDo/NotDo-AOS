package com.notdo.feature_ui_signup.viewmodel.mvi

data class SignUpState(
    val email: String = "",
    val password: String = "",
    val nickname: String = ""
)
