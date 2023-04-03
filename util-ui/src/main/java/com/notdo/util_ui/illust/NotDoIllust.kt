package com.notdo.util_ui.illust

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.notdo.util_ui.R
import com.notdo.util_ui.icon.NotDoIcon

@Immutable
class NotDoIllust private constructor(
    @DrawableRes val drawableId: Int,
    val contentDescription: String? = null,
) {
    companion object {
        @Stable
        val BookIllust = NotDoIllust(
            drawableId = R.drawable.book_illust,
            contentDescription = "book illust"
        )

        @Stable
        val FirecrackerIllust = NotDoIllust(
            drawableId = R.drawable.firecracker_illust,
            contentDescription = "firecracker illust"
        )

        @Stable
        val FixIllust = NotDoIllust(
            drawableId = R.drawable.fix_illust,
            contentDescription = "fix illust"
        )

        @Stable
        val FlagIllust = NotDoIllust(
            drawableId = R.drawable.flag_illust,
            contentDescription = "flag illust"
        )

//        @Stable
//        val question = NotDoIllust(
//            drawableId = R.drawable.question_illust,
//            contentDescription = "question illust"
//        )


        @Stable
        val HappyNotDo  = NotDoIllust(
            drawableId = R.drawable.happy_notdo_illust,
            contentDescription = "happy notdo illust"
        )

        @Stable
        val SadNotDo = NotDoIllust(
            drawableId = R.drawable.sad_notdo_illust,
            contentDescription = "sad notdo illust"
        )

        @Stable
        val NormalNotDo = NotDoIllust(
            drawableId = R.drawable.normal_notdo_illust,
            contentDescription = "normal notdo illust"
        )

        @Stable
        val DepressionNotDo = NotDoIllust(
            drawableId = R.drawable.depression_notdo_illust,
            contentDescription = "depression notdo illust"
        )

        @Stable
        val AngryNotDo = NotDoIllust(
            drawableId = R.drawable.angry_notdo_illust,
            contentDescription = "angry notdo illust"
        )
    }
}