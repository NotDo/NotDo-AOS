package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.feature_ui_signup.ui.component.CheckBox
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun AgreeTermsScreen(navController: NavController) {
    var isAgreeTremsChecked by remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        NormalHeader(title = "회원가입") {
            navController.navigate(NotDoRoutes.INTRO_ROUTE)
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        GreetingsNotDoView(text = "낫두가 \n처음이시군요?")
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        NotDoFont.Caption2(
            text = "약관동의",
            fontWeight = FontWeight.Normal,
            modifier = Modifier.fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier = Modifier.fillMaxWidth(0.9f)) {
            CheckBox {
                isAgreeTremsChecked = it
            }
            Spacer(modifier = Modifier.size(10.dp))
            Column {
                NotDoFont.Title(text = "개인정보 3자 제공 동의")
                Spacer(modifier = Modifier.size(6.dp))
                NotDoFont.Caption1(
                    text = "자세히 보기",
                    color = NotDoColor.Gray500,
                    modifier = Modifier.notDoClickable {
                        navController.navigate(NotDoRoutes.SignUp.AGREE_TERMS_DETAIL_SCREEN)
                    })
            }
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
            NotDoButton(text = "다음", isActivation = isAgreeTremsChecked) {

            }
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        }
    }
}