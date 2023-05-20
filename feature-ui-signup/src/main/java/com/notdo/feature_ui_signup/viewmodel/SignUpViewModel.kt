package com.notdo.feature_ui_signup.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.notdo.feature_domain_signup.domain.model.req.UserAccountInfoModel
import com.notdo.feature_domain_signup.domain.usecase.SignUpUseCase
import com.notdo.feature_ui_signup.viewmodel.mvi.SignUpSideEffect
import com.notdo.feature_ui_signup.viewmodel.mvi.SignUpState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
) : ContainerHost<SignUpState, SignUpSideEffect>, ViewModel() {

    override val container = container<SignUpState, SignUpSideEffect>(SignUpState())

    fun signUpRequest(email: String, password: String, nickname: String) = intent {
        viewModelScope.launch {
            signUpUseCase(
                UserAccountInfoModel(
                    email = email,
                    password = password,
                    nickname = nickname
                )
            ).onSuccess {
                it.collect { response ->
                    when (response.status) {
                        201 -> postSideEffect(SignUpSideEffect.SignUpSuccess)
                        400 -> postSideEffect(SignUpSideEffect.RegularExpressionException)
                        409 -> postSideEffect(SignUpSideEffect.UserAreadyExist)
                        else -> postSideEffect(SignUpSideEffect.UnknownException)
                    }
                }
            }.onFailure {
                postSideEffect(SignUpSideEffect.UnknownException)
            }
        }
    }

}