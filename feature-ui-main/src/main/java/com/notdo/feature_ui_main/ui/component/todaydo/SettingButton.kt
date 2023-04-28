package com.notdo.feature_ui_main.ui.component.todaydo

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun SettingButton(onClick: () -> Unit) {
    Icon(
        painter = painterResource(id = NotDoIcon.CababButtonIcon.drawableId),
        contentDescription = NotDoIcon.CababButtonIcon.contentDescription,
        tint = NotDoColor.White,
        modifier = Modifier.notDoClickable(false) {
            onClick()
        }
    )
}