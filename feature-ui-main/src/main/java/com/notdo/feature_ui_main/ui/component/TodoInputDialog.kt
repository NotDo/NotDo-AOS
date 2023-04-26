package com.notdo.feature_ui_main.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.component.NotDoTextField
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.illust.NotDoIllust

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TodoInputDialog(
    visible: Boolean,
    onDismissRequest: () -> Unit,
) {
    var text by remember {
        mutableStateOf("")
    }

    if (visible) {
        CustomAlertDialog(
            onDismissRequest = { onDismissRequest() },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(415.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(NotDoColor.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                ) {
                    Spacer(modifier = Modifier.size(40.dp))
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(id = NotDoIllust.NotDoFace.drawableId),
                            contentDescription = NotDoIllust.NotDoFace.contentDescription,
                            modifier = Modifier
                                .width(64.dp)
                                .height(18.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(20.dp))
                    NotDoFont.Hedline1(
                        text = "이루고 싶은 목표를\n적어주세요.",
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.size(32.dp))
                    NotDoFont.Caption1(
                        text = "반복 설정하기",
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    NotDoFont.Caption2(
                        text = "나의 목표 목록 옆에 버튼을 눌러\n반복 설정을 누르면 설정되요.",
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
                        text = it
                    }
                    Spacer(modifier = Modifier.size(16.dp))
                    NotDoButton(text = "작성", isActivation = text != "") {
                        //TODO 작성한 투두 로컬에 저장하는 로직
                    }
                    Spacer(modifier = Modifier.size(40.dp))
                }
            }
        }
    }
}