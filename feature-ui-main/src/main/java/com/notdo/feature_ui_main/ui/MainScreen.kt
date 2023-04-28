package com.notdo.feature_ui_main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.feature_ui_main.ui.component.TodoInputDialog
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.NotDoCheckBox
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun MainScreen(navController: NavController) {
    var visible by remember {
        mutableStateOf(true)
    }

    TodoInputDialog(visible = visible) {
        //TODO 로컬 저장 로직
        visible = false
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.91f)
                .wrapContentHeight()
        ) {
            NotDoFont.Title(text = "나의 목표", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(NotDoColor.Black)
            ) {
                Row(
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Spacer(modifier = Modifier.size(12.dp))
                    NotDoCheckBox {

                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    NotDoFont.Subtitle(
                        text = "책 50p ~ 100p 읽기",
                        color = NotDoColor.White
                    )
                }
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    Icon(
                        painter = painterResource(id = NotDoIcon.CababButtonIcon.drawableId),
                        contentDescription = NotDoIcon.CababButtonIcon.contentDescription,
                        tint = NotDoColor.White,
                        modifier = Modifier.notDoClickable(false) { }
                    )
                    Spacer(modifier = Modifier.size(12.dp))
                }
            }
        }
    }
}