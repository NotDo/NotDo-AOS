package com.notdo.feature_data_signup.data.remote.network.api

import com.notdo.feature_data_signup.data.remote.dto.req.UserAccountInfoDTO
import com.notdo.feature_data_signup.data.remote.dto.res.TokenInfoDTO
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface SignUpAPI {
    @POST("auth/signup")
    suspend fun signUp(
        @Body body: UserAccountInfoDTO
    ): Response<TokenInfoDTO>
}