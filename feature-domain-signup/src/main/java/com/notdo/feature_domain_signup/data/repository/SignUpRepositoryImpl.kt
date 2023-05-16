package com.notdo.feature_domain_signup.data.repository

import com.notdo.feature_domain_signup.data.remote.datasource.SignUpDataSource
import com.notdo.feature_domain_signup.data.remote.dto.req.UserAccountInfoDTO
import com.notdo.feature_domain_signup.data.remote.dto.res.toModel
import com.notdo.feature_domain_signup.domain.model.req.UserAccountInfoModel
import com.notdo.feature_domain_signup.domain.model.res.TokenInfoModel
import com.notdo.feature_domain_signup.domain.repository.SignUpRepository
import com.notdo.util_network.ApiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class SignUpRepositoryImpl @Inject constructor(
    private val dataSource: SignUpDataSource
) : SignUpRepository {
    override suspend fun signUp(body: UserAccountInfoModel): Flow<ApiState<TokenInfoModel>> {
        return dataSource.signUp(
            body = UserAccountInfoDTO(
                email = body.email,
                password = body.password,
                nickname = body.nickname
            )
        ).map {
            when (it) {
                is ApiState.Success -> ApiState.Success(
                    data = it.data!!.toModel(),
                    status = it.status!!
                )
                is ApiState.Error -> ApiState.Error(message = it.message!!, status = it.status!!)
                is ApiState.Loading -> ApiState.Loading()
            }
        }
    }
}