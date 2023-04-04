package com.notdo.util_ui.icon

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.notdo.util_ui.R

@Immutable
class NotDoIcon private constructor(
    @DrawableRes val drawableId: Int,
    val contentDescription: String? = null,
) {
    companion object {
        @Stable
        val CategoryButtonIcon = NotDoIcon(
            drawableId = R.drawable.category_button_ic,
            contentDescription = "category button icon"
        )

        @Stable
        val AddButtonIcon = NotDoIcon(
            drawableId = R.drawable.add_button_ic,
            contentDescription = "add button icon"
        )

        @Stable
        val BackButtonIcon = NotDoIcon(
            drawableId = R.drawable.back_button_ic,
            contentDescription = "back button icon"
        )

        @Stable
        val CababButtonIcon = NotDoIcon(
            drawableId = R.drawable.cabab_button_ic,
            contentDescription = "cabab button icon"
        )

        @Stable
        val CloseButtonIcon = NotDoIcon(
            drawableId = R.drawable.close_button_ic,
            contentDescription = "close button icon"
        )

        @Stable
        val DeleteButtonIcon = NotDoIcon(
            drawableId = R.drawable.delete_button_ic,
            contentDescription = "delete button icon"
        )

        @Stable
        val NotificationButtonIcon = NotDoIcon(
            drawableId = R.drawable.notification_button_ic,
            contentDescription = "notification button icon"
        )

        @Stable
        val RepeatIcon = NotDoIcon(
            drawableId = R.drawable.repeat_ic,
            contentDescription = "repeat icon"
        )

        @Stable
        val SettingButtonIcon = NotDoIcon(
            drawableId = R.drawable.setting_button_ic,
            contentDescription = "setting button icon"
        )

        @Stable
        val ShareButtonFirstIcon = NotDoIcon(
            drawableId = R.drawable.share_button_ic,
            contentDescription = "share button first icon"
        )

        @Stable
        val ShareButtonSecondIcon = NotDoIcon(
            drawableId = R.drawable.share_button_2_ic,
            contentDescription = "share button second icon"
        )

        @Stable
        val TextDeleteButtonIcon = NotDoIcon(
            drawableId = R.drawable.text_delete_ic,
            contentDescription = "text delete button icon"
        )

        @Stable
        val TextVisbleTrueIcon = NotDoIcon(
            drawableId = R.drawable.text_visible_true_ic,
            contentDescription = "text visible true icon"
        )

        @Stable
        val WifiConnectIcon = NotDoIcon(
            drawableId = R.drawable.wifi_connect_ic,
            contentDescription = "wifi connect icon"
        )

        @Stable
        val WifiDisconnectIcon = NotDoIcon(
            drawableId = R.drawable.wifi_disconnect_ic,
            contentDescription = "wifi disconnect icon"
        )

        @Stable
        val WriteButtonIcon = NotDoIcon(
            drawableId = R.drawable.write_button_ic,
            contentDescription = "write button icon"
        )

        @Stable
        val CheckBoxIcon = NotDoIcon(
            drawableId = R.drawable.check_ic,
            contentDescription = "checkbox check icon"
        )
    }
}