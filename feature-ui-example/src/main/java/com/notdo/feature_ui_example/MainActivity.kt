package com.notdo.feature_ui_example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.notdo.feature_ui_example.ui.theme.NotDoAosTheme
import com.notdo.util_ui.font.NotDoFont

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotDoFont.Body(text = "이것은 바디 입니다!!", modifier = Modifier.clickable { Log.d("dd","ddd") }, fontWeight = FontWeight.SemiBold)
        }
    }
}