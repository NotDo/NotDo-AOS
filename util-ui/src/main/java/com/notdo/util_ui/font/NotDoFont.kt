package com.notdo.util_ui.font

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.notdo.util_ui.R
import com.notdo.util_ui.color.NotDoColor

internal val pretendardFamily = FontFamily(
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold)
)

object NotDoFont {

    @Composable
    fun Hedline1(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 24.sp,
                lineHeight = 30.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Hedline2(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 20.sp,
                lineHeight = 26.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }


    @Composable
    fun Title(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 16.sp,
                lineHeight = 22.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Subtitle(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 15.sp,
                lineHeight = 21.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Body(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 14.sp,
                lineHeight = 20.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Caption1(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 13.sp,
                lineHeight = 18.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Caption2(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 12.sp,
                lineHeight = 16.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }

    @Composable
    fun Caption3(
        modifier: Modifier = Modifier,
        text: String,
        fontWeight: FontWeight = FontWeight.Normal,
        color: Color = NotDoColor.Black,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier,
            text = text,
            style = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = fontWeight,
                fontSize = 11.sp,
                lineHeight = 15.sp,
            ),
            color = color,
            textAlign = textAlign,
        )
    }
}