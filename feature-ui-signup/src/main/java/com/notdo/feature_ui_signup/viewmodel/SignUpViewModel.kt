package com.notdo.feature_ui_signup.viewmodel

import androidx.lifecycle.ViewModel
import com.notdo.feature_domain_signup.domain.usecase.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
) : ViewModel() {

}