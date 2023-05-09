package com.notdo.feature_ui_findpassword.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.notdo.util_kotlin.format.isEmailPattern
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField

@Composable
fun EmailInputScreen(
    navController: NavController
) {
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
        NormalHeader(title = "비밀번호 찾기") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "가입하신 이메일을 \n입력해주세요.")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        NotDoTextField(
            text = text,
            labelText = "이메싱",
            hintText = "가입하신 이메일을 입력해주세요.",
            isError = isError,
            errorMsg = "이메일 형식에 맞게 입력해 주세요."
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
        NotDoButton(
            text = "찾기",
            isActivation = text != ""
        ) {
            isError = text.isEmailPattern()
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}
