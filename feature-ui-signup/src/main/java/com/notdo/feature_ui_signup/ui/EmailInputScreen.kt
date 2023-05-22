package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.notdo.feature_ui_signup.viewmodel.SignUpViewModel
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_kotlin.format.isEmailPattern
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun EmailInputScreen(
    navController: NavController,
    signUpViewModel: SignUpViewModel = hiltViewModel()
) {
    var email by remember {
        mutableStateOf("")
    }

    var isError by remember {
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
        GreetingsNotDoView(text = "낫두가 \n처음이시군요?")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Spacer(modifier = Modifier.size(10.dp))
        NotDoTextField(
            text = email,
            labelText = "이메일",
            hintText = "이메일을 입력해주세요.",
            isError = isError,
            errorMsg = "이메일 형식에 맞게 입력해주세요."
        ) {
            email = it
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
                navController.navigate(NotDoRoutes.SIGNIN_ROUTE)
            }
        ) {
            NotDoFont.Caption1(text = "이미 낫두 회원이신가요? ")
            NotDoFont.Caption1(text = "로그인 하러가기", fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.size(24.dp))
        NotDoButton(text = "다음", isActivation = email != "") {
            isError = email.isEmailPattern()
            if (!isError) {
                //TODO 이메일 뷰모델에 저장로직
                navController.navigate(NotDoRoutes.SignUp.EMAIL_CODE_CHECK_SCREEN)
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
    }
}