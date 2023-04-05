package com.notdo.util_ui.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.font.pretendardFamily
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun NotDoTextField(
    text: String,
    labelText: String = "",
    errorMsg: String = "",
    hintText: String = "",
    isPassword: Boolean = false,
    isError: Boolean = false,
    onValueChange: (String) -> Unit
) {
    var passwordVisible by remember {
        mutableStateOf(isPassword)
    }

    var hasFocus by remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier.wrapContentSize()) {
        NotDoFont.Caption2(
            text = labelText,
            color = NotDoColor.Black,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.size(10.dp))
        OutlinedTextField(
            value = text,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(10.dp))
                .border(
                    1.dp,
                    if (isError) NotDoColor.Error else if (hasFocus) NotDoColor.Black else NotDoColor.Gray300,
                    RoundedCornerShape(10.dp)
                )
                .onFocusChanged { focusState -> hasFocus = focusState.hasFocus },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = NotDoColor.Black,
                cursorColor = if (isError) NotDoColor.Error else NotDoColor.Black,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                errorBorderColor = Color.Transparent
            ),
            placeholder = {
                NotDoFont.Body(
                    text = hintText,
                    fontWeight = FontWeight.Normal,
                    color = NotDoColor.Gray300
                )
            },
            textStyle = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.sp,
            ),
            maxLines = 5,
            visualTransformation = if (passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,
            trailingIcon = {
                Row {
                    if (text != "") {
                        if (isPassword) {
                            Image(
                                painter = painterResource(if (passwordVisible) NotDoIcon.TextVisbleFalseIcon.drawableId else NotDoIcon.TextVisbleTrueIcon.drawableId),
                                contentDescription = if (passwordVisible) NotDoIcon.TextVisbleFalseIcon.contentDescription else NotDoIcon.TextVisbleTrueIcon.contentDescription,
                                modifier = Modifier.notDoClickable { passwordVisible = !passwordVisible }
                            )
                            Spacer(modifier = Modifier.size(8.dp))
                        }
                        Image(
                            painter = painterResource(NotDoIcon.TextDeleteButtonIcon.drawableId),
                            contentDescription = NotDoIcon.TextDeleteButtonIcon.contentDescription,
                            modifier = Modifier.notDoClickable { onValueChange("") }
                        )
                        Spacer(modifier = Modifier.size(12.dp))
                    }
                }
            }
        )
        Spacer(modifier = Modifier.size(12.dp))
        NotDoFont.Caption2(
            text = if (isError) {
                if (text.isEmpty()) "*텍스트를 입력해 주세요." else "*$errorMsg"
            } else "",
            color = if (isError) NotDoColor.Error else NotDoColor.Black,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun EmailCodeCheckTextField(
    text: String,
    isError: Boolean,
    time: Int,
    onReSendButtonClick: () -> Unit,
    onValueChange: (String) -> Unit
) {
    var hasFocus by remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier.wrapContentSize()) {
        NotDoFont.Caption2(
            text = "인증번호",
            color = NotDoColor.Black,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.size(10.dp))
        OutlinedTextField(
            value = text,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(10.dp))
                .border(
                    1.dp,
                    if (isError) NotDoColor.Error else if (hasFocus) NotDoColor.Black else NotDoColor.Gray300,
                    RoundedCornerShape(10.dp)
                )
                .onFocusChanged { focusState -> hasFocus = focusState.hasFocus },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = NotDoColor.Black,
                cursorColor = if (isError) NotDoColor.Error else NotDoColor.Black,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                errorBorderColor = Color.Transparent
            ),
            placeholder = {
                NotDoFont.Body(
                    text = "4자리 숫자를 입력해 주세요.",
                    fontWeight = FontWeight.Normal,
                    color = NotDoColor.Gray300
                )
            },
            textStyle = TextStyle(
                fontFamily = pretendardFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.sp,
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            singleLine = true,
            trailingIcon = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (text != "") {
                        Image(
                            painter = painterResource(NotDoIcon.TextDeleteButtonIcon.drawableId),
                            contentDescription = NotDoIcon.TextDeleteButtonIcon.contentDescription,
                            modifier = Modifier.notDoClickable { onValueChange("") }
                        )
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    NotDoFont.Body(
                        text = "0${time / 60}:${if (time % 60 < 10) "0" + (time % 60) else time % 60}",
                        color = NotDoColor.Gray400
                    ).let {
                        Log.d("recomposition", "text")
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    NotDoFont.Body(
                        text = "재전송",
                        color = NotDoColor.Black,
                        modifier = Modifier.notDoClickable { onReSendButtonClick() }
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                }.let {
                    Log.d("recomposition", "row")
                }
            }
        )
        Spacer(modifier = Modifier.size(12.dp))
        NotDoFont.Caption2(
            text = if (isError) {
                if (text.isEmpty()) "*텍스트를 입력해 주세요." else "*인증번호가 일치하지 않습니다."
            } else "",
            color = if (isError) NotDoColor.Error else NotDoColor.Black,
            fontWeight = FontWeight.Medium
        )
    }
}