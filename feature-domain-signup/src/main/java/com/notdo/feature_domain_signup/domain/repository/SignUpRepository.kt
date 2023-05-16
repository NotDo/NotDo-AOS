package com.notdo.feature_domain_signup.domain.repository

import com.notdo.feature_domain_signup.domain.model.req.UserAccountInfoModel
import com.notdo.feature_domain_signup.domain.model.res.TokenInfoModel
import com.notdo.util_network.ApiState
import kotlinx.coroutines.flow.Flow

interface SignUpRepository {
    suspend fun signUp(body: UserAccountInfoModel): Flow<ApiState<TokenInfoModel>>
}