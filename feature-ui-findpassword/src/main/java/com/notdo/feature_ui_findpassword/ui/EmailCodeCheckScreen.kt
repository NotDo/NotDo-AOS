package com.notdo.feature_ui_findpassword.ui

import android.os.CountDownTimer
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.notdo.util_ui.component.*

@Composable
fun EmailCodeCheckScreen(
    navController: NavController
) {
    var code by remember {
        mutableStateOf("")
    }

    var isError by remember {
        mutableStateOf(false)
    }

    var errorMsg by remember {
        mutableStateOf(" ")
    }

    var time by remember { mutableStateOf(301) }

    var countDownTimer: CountDownTimer by remember {
        mutableStateOf(
            object : CountDownTimer((time * 1000).toLong(), 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    time = (millisUntilFinished / 1000).toInt()
                }

                override fun onFinish() {
                    isError = true
                    errorMsg = "인증번호 유효시간이 만료었어요."
                    time = 0
                }
            }.start()
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalHeader(title = "비밀번호 찾기") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "이메일로 인증번호를 \n보냈어요.")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        EmailCodeCheckTextField(
            text = code,
            isError = isError,
            time = time,
            errorMsg = errorMsg,
            onReSendButtonClick = {
                countDownTimer.cancel()
                time = 300
                countDownTimer = object : CountDownTimer((time * 1000).toLong(), 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                        time = (millisUntilFinished / 1000).toInt()
                    }

                    override fun onFinish() {
                        isError = true
                        errorMsg = "인증번호 유효시간이 만료었어요."
                        time = 0
                    }
                }.start()
            },
        ) {
            code = it
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NotDoButton(
            text = "인증",
            isActivation = code != ""
        ) {
            //TODO 이메일 인증 요청 로직
            //TODO 실패에 따른 예외처리
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}

