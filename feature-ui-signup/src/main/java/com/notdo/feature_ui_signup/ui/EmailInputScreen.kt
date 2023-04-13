package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.navigator.NotDoRoutes
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
        NotDoFont.Caption2(
            text = "이메일",
            fontWeight = FontWeight.Normal,
            modifier = Modifier.fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.size(10.dp))
        NotDoTextField(text = text) {
            text = it
        }
    }
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
        Row(modifier = Modifier
            .notDoClickable {

            }
        ) {
            NotDoFont.Caption1(text = "이미 낫두 회원이신가요? ")
            NotDoFont.Caption1(text = "로그인 하러가기", fontWeight = FontWeight.SemiBold)
        }
        NotDoButton(text = "다음", isActivation = text != "") {
            navController.navigate(NotDoRoutes.SignUp.EMAIL_INPUT_SCREEN)
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
    }
}