package com.notdo.util_ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.font.NotDoFont

@Composable
fun NotDoButton(
    text: String,
    isActivation: Boolean,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isActivation) NotDoColor.Black else NotDoColor.Gray300,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp),
        enabled = isActivation
    ) {
        NotDoFont.Title(
            text = text,
            fontWeight = FontWeight.Normal,
            color = Color.White
        )
    }
}