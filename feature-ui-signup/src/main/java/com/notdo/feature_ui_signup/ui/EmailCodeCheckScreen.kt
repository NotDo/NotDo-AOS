package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.EmailCodeCheckTextField
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import kotlinx.coroutines.delay

@Composable
fun EmailCodeCheckScreen(navController: NavController) {
    var emailCheckCode by remember {
        mutableStateOf("")
    }

    var isError by remember {
        mutableStateOf(false)
    }

    var errorMsg by remember {
        mutableStateOf("")
    }

    var time by remember {
        mutableStateOf(300)
    }

    LaunchedEffect("email-code-check-time") {
        while (true) {
            delay(1000)
            time--
            if (time == 0) {
                isError = true
                errorMsg = "인증번호가 일치하지 않아요."
                break
            }
        }
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
        GreetingsNotDoView(text = "이메일로 \n인증번호를 보냈어요.")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Spacer(modifier = Modifier.size(10.dp))
        EmailCodeCheckTextField(
            text = emailCheckCode,
            isError = isError,
            time = time,
            errorMsg = errorMsg,
            onReSendButtonClick = {
                //TODO 이메일 재전송 요청 로직
                time = 300
            }
        ) {
            emailCheckCode = it
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NotDoButton(text = "인증", isActivation = emailCheckCode != "") {
            if (!isError) {
                //TODO 서버통신으로 코드 인증 로직
                navController.navigate(NotDoRoutes.SignUp.PASSWORD_INPUT_SCREEN)
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}