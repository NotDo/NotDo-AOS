package com.notdo.feature_domain_signup.data.remote.datasource

import com.notdo.feature_domain_signup.data.remote.dto.req.UserAccountInfoDTO
import com.notdo.feature_domain_signup.data.remote.dto.res.TokenInfoDTO
import com.notdo.feature_domain_signup.data.remote.network.api.SignUpAPI
import com.notdo.util_network.ApiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class SignUpDataSourceImpl @Inject constructor(
    private val service: SignUpAPI
) : SignUpDataSource {
    override suspend fun signUp(body: UserAccountInfoDTO): Flow<ApiState<TokenInfoDTO>> = flow {
        try {
            val response = service.signUp(body = body)
            if (response.isSuccessful) {
                response.body()?.let {
                    emit(ApiState.Success(it, status = response.code()))
                }
            } else {
                try {
                    emit(
                        ApiState.Error(
                            response.errorBody()!!.string(),
                            status = response.code()
                        )
                    )
                } catch (e: IOException) {
                    throw e
                }
            }
        } catch (e: Exception) {
            throw e
        } as Unit
    }.flowOn(Dispatchers.IO)
}