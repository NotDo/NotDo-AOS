package com.notdo.feature_ui_main.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.NotDoCheckBox
import com.notdo.util_ui.font.NotDoFont

@Composable
fun TodayDoBar() {
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
                TodayDo(text = "책 50p ~ 100p 읽기")
            }
            Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                SettingButton {

                }
                Spacer(modifier = Modifier.size(12.dp))
            }
        }
    }
}