package com.notdo.feature_ui_signup.ui.component


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun CheckBox(
    checkStatus: (Boolean) -> Unit
) {

    val isCheck = remember {
        mutableStateOf(false)
    }

    if (isCheck.value) {
        Box(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(NotDoColor.CheckBoxColor)
                .notDoClickable(false) {
                    isCheck.value = false
                    checkStatus(false)
                }
        ) {
            Icon(
                painter = painterResource(NotDoIcon.CheckBoxIcon.drawableId),
                contentDescription = NotDoIcon.CheckBoxIcon.contentDescription,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    } else {
        Box(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
                .clip(RoundedCornerShape(7.dp))
                .border(1.dp, NotDoColor.Black, RoundedCornerShape(7.dp))
                .notDoClickable(false) {
                    isCheck.value = true
                    checkStatus(true)
                }
        )
    }
}