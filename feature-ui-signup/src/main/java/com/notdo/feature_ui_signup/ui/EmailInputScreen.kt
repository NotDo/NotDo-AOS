package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.util_kotlin.format.isEmailPattern
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun EmailInputScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }

    var isError by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalHeader(title = "회원가입") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "낫두가 \n처음이시군요?")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Spacer(modifier = Modifier.size(10.dp))
        NotDoTextField(
            text = text,
            labelText = "이메일",
            hintText = "이메일을 입력해주세요.",
            isError = isError,
            errorMsg = "이메일 형식에 맞게 입력해주세요."
        ) {
            text = it
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .notDoClickable {
                //TODO 로그인으로 이동 로직 작성
            }
        ) {
            NotDoFont.Caption1(text = "이미 낫두 회원이신가요? ")
            NotDoFont.Caption1(text = "로그인 하러가기", fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.size(24.dp))
        NotDoButton(text = "다음", isActivation = text != "") {
            isError = text.isEmailPattern()
            if (!isError) {
                //TODO 이메일 인증페이지로 이동 로직 작성
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}