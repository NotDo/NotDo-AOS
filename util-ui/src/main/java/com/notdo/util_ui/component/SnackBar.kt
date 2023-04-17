package com.notdo.util_ui.component

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.font.NotDoFont
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun NotDoSnackBar(text: String, iconId: Int, iconDescription: String?) {

    val customSnackBarHost: @Composable (SnackbarHostState) -> Unit =
        { snackbarHostState: SnackbarHostState ->
            SnackbarHost(
                hostState = snackbarHostState,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(NotDoColor.DimedLayer)
                        .padding(vertical = 12.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.size(16.dp))
                    Icon(
                        painter = painterResource(iconId),
                        contentDescription = iconDescription
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    NotDoFont.Subtitle(text = text)
                }
            }
        }

    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        modifier = Modifier,
        scaffoldState = scaffoldState,
        snackbarHost = customSnackBarHost
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            scope.launch {
                scaffoldState.snackbarHostState.showSnackbar(
                    message = "SnackBarMessage",
                    duration = SnackbarDuration.Short
                )
            }
        }
    }
}