package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.util_kotlin.format.isPasswordPattern
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField


@Composable
fun PasswordInputScreen(navController: NavController) {
    var password by remember {
        mutableStateOf("")
    }

    var reInputPassword by remember {
        mutableStateOf("")
    }

    var isPasswordError by remember {
        mutableStateOf(false)
    }

    var isReInputPasswordError by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(NotDoColor.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalHeader(title = "회원가입") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "사용하실 \n비밀번호를 적어주세요.")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Spacer(modifier = Modifier.size(10.dp))
        NotDoTextField(
            text = password,
            isPassword = true,
            labelText = "비밀번호",
            hintText = "영문,숫자,특수문자를 포함하여 8~20자리로 입력해주세요.",//TODO 멘트 수정 필요
            isError = isPasswordError,
            errorMsg = "비밀번호 형식을 맞춰주세요."
        ) {
            password = it
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        NotDoTextField(
            text = reInputPassword,
            isPassword = true,
            labelText = "비밀번호 재입력",
            hintText = "위에서 입력하신 비밀번호를 한 번 더 입력해주세요.",
            isError = isReInputPasswordError,
            errorMsg = "비밀번호가 일치하지 않습니다."
        ) {
            reInputPassword = it
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NotDoButton(text = "다음", isActivation = password != "" && reInputPassword != "") {
            isPasswordError = password.isPasswordPattern()
            isReInputPasswordError = (password != reInputPassword)
            if (!isPasswordError && !isReInputPasswordError) {
                //TODO 회원가입 요청 로직
                //TODO 회원가입 성공시 가입축하 페이지로 이동 로직
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}