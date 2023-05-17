package com.notdo.feature_ui_signup.viewmodel.mvi

sealed class SignUpSideEffect {
    object SignUpSuccess : SignUpSideEffect()

    object RegularExpressionException : SignUpSideEffect()

    object UserAreadyExist : SignUpSideEffect()
}