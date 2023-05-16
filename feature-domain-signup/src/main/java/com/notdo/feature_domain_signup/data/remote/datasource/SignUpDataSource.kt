package com.notdo.feature_domain_signup.data.remote.datasource

import com.notdo.feature_domain_signup.data.remote.dto.req.UserAccountInfoDTO
import com.notdo.feature_domain_signup.data.remote.dto.res.TokenInfoDTO
import com.notdo.util_network.ApiState
import kotlinx.coroutines.flow.Flow

interface SignUpDataSource {
    suspend fun signUp(body: UserAccountInfoDTO): Flow<ApiState<TokenInfoDTO>>
}