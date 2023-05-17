package com.notdo.feature_domain_signup.domain.usecase

import com.notdo.feature_domain_signup.domain.model.req.UserAccountInfoModel
import com.notdo.feature_domain_signup.domain.repository.SignUpRepository
import javax.inject.Inject

class SignUpUseCase @Inject constructor(
    private val repository: SignUpRepository
) {
    suspend operator fun invoke(body: UserAccountInfoModel) =
        repository.signUp(body = body)
}