package com.notdo.feature_ui_intro.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.illust.NotDoIllust
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun IntroScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(NotDoColor.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(NotDoIllust.NotDoFace.drawableId),
                contentDescription = NotDoIllust.NotDoFace.contentDescription
            )
            Spacer(modifier = Modifier.size(32.dp))
            NotDoFont.Hedline1(
                text = "낫두와 함께 목표를 \n매일 세우고 함께 성장해봐요!",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        }
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NotDoButton(text = "로그인") {
                //TODO 로그인 페이지 이동로직
            }
            Spacer(modifier = Modifier.size(32.dp))
            Row(modifier = Modifier
                .notDoClickable {
                    navController.navigate(NotDoRoutes.SIGNUP_ROUTE)
                }
            ) {
                NotDoFont.Caption1(text = "혹시 낫두가 처음이신가요? ")
                NotDoFont.Caption1(text = "회원가입", fontWeight = FontWeight.SemiBold)
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        }
    }
}