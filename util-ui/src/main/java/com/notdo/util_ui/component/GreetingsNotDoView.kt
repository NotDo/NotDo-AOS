package com.notdo.util_ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.illust.NotDoIllust

@Composable
fun GreetingsNotDoView(text: String) {
    Column(modifier = Modifier.fillMaxWidth(0.9f)) {
        Image(
            painter = painterResource(NotDoIllust.NotDoFace.drawableId),
            contentDescription = NotDoIllust.NotDoFace.contentDescription,
            modifier = Modifier.fillMaxWidth(0.2f)
        )
        Spacer(modifier = Modifier.size(20.dp))
        NotDoFont.Hedline1(text = text, fontWeight = FontWeight.SemiBold)
    }
}