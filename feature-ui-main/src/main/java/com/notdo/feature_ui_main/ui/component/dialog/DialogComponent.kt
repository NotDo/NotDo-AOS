package com.notdo.feature_ui_main.ui.component.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.illust.NotDoIllust

@Composable
fun DialogComponent(text: String, onValueCange: (String) -> Unit, onClick: () -> Unit) {
    Box {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight()
                .align(Alignment.Center),
        ) {
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = NotDoIllust.NotDoFace.drawableId),
                    contentDescription = NotDoIllust.NotDoFace.contentDescription,
                    modifier = Modifier
                        .width(64.dp)
                        .height(18.dp)
                )
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            NotDoFont.Hedline2(
                text = "이루고 싶은 목표를\n적어주세요.",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.08f))
            NotDoFont.Caption1(
                text = "반복 설정하기",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            NotDoFont.Caption2(
                text = "나의 목표 목록 옆에 버튼을 눌러\n반복 설정을 누르면 설정돼요.",
                color = NotDoColor.Gray500,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            NotDoTextField(text = text, hintText = "ex) 토익 990점 달성") {
                onValueCange(it)
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.04f))
            NotDoButton(text = "작성", isActivation = text != "") {
                onClick()
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        }
    }
}