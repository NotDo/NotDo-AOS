package com.notdo.feature_domain_signup.data.remote.datasource

import com.notdo.feature_domain_signup.data.remote.dto.req.UserAccountInfoDTO
import com.notdo.feature_domain_signup.data.remote.dto.res.TokenInfoDTO
import com.notdo.feature_domain_signup.data.remote.network.api.SignUpAPI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SignUpDataSourceImpl @Inject constructor(
    private val service: SignUpAPI
) : SignUpDataSource {
    override suspend fun signUp(body: UserAccountInfoDTO): Flow<TokenInfoDTO> = flow {
        
    }
}