package com.notdo.feature_ui_signin.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun SignInScreen(
    navController: NavController
) {
    var password by remember {
        mutableStateOf("")
    }

    var reInputPassword by remember {
        mutableStateOf("")
    }

    var isEmailError by remember {
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
        NormalHeader(title = "로그인") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "낫두에 다시 \n오신걸 환영해요!")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Spacer(modifier = Modifier.size(10.dp))
        NotDoTextField(
            text = password,
            labelText = "이메일",
            hintText = "가입하신 이메일을 입력해주세요.",
            isError = isEmailError,
            errorMsg = null
        ) {
            password = it
        }
        NotDoTextField(
            text = reInputPassword,
            isPassword = true,
            labelText = "비밀번호",
            hintText = "가입하신 비밀번호를 입력해주세요.",
            isError = isReInputPasswordError,
            errorMsg = null
        ) {
            reInputPassword = it
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.notDoClickable { /*TODO 비번찾기 페이지로 이동로직*/ }
            ) {
                NotDoFont.Caption1(text = "비밀번호를 잊으셨나요?")
                Spacer(modifier = Modifier.size(6.dp))
                Icon(
                    painter = painterResource(NotDoIcon.ArrowGoIcon.drawableId),
                    contentDescription = NotDoIcon.ArrowGoIcon.contentDescription
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NotDoButton(text = "다음", isActivation = password != "" && reInputPassword != "") {
            //TODO 로그인 요청 성공시 메인으로 이동로직
            //TODO 로그인 요청
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}