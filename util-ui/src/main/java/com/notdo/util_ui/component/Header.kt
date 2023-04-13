package com.notdo.util_ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.R
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable

@Composable
fun DefalutHeader(
    onClickNotificationIcon: () -> Unit,
    onClickCategoryIcon: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 15.dp)
    ) {
        NotDoFont.Hedline1(text = "낫두 상태", fontWeight = FontWeight.SemiBold)
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
            Icon(
                painter = painterResource(NotDoIcon.NotificationButtonIcon.drawableId),
                contentDescription = NotDoIcon.NotificationButtonIcon.contentDescription,
                modifier = Modifier.notDoClickable {
                    onClickNotificationIcon()
                }
            )
            Spacer(modifier = Modifier.size(8.dp))
            Image(
                painter = painterResource(R.drawable.defalut_profile_img),
                contentDescription = "user profile image"
            )
            Spacer(modifier = Modifier.size(8.dp))
            Icon(
                painter = painterResource(NotDoIcon.CategoryButtonIcon.drawableId),
                contentDescription = NotDoIcon.CategoryButtonIcon.contentDescription,
                modifier = Modifier.notDoClickable {
                    onClickCategoryIcon()
                }
            )
        }
    }
}

@Composable
fun ScrollHeader(
    notDoEmotion: String,
    onClickNotificationIcon: () -> Unit,
    onClickCategoryIcon: () -> Unit
) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 15.dp)
        ) {
            NotDoFont.Hedline1(text = "낫두 상태 : $notDoEmotion", fontWeight = FontWeight.SemiBold)
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                Icon(
                    painter = painterResource(NotDoIcon.NotificationButtonIcon.drawableId),
                    contentDescription = NotDoIcon.NotificationButtonIcon.contentDescription,
                    modifier = Modifier.notDoClickable(false) {
                        onClickNotificationIcon()
                    }
                )
                Spacer(modifier = Modifier.size(8.dp))
                Image(
                    painter = painterResource(R.drawable.defalut_profile_img),
                    contentDescription = "user profile image"
                )
                Spacer(modifier = Modifier.size(8.dp))
                Icon(
                    painter = painterResource(NotDoIcon.CategoryButtonIcon.drawableId),
                    contentDescription = NotDoIcon.CategoryButtonIcon.contentDescription,
                    modifier = Modifier.notDoClickable(false) {
                        onClickCategoryIcon()
                    }
                )
            }
        }
        Canvas(modifier = Modifier.fillMaxWidth()) {
            drawLine(
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = size.width, y = 0f),
                color = NotDoColor.Gray600
            )
        }
    }
}

@Composable
fun DiaryHeader(
    onBackPressed: () -> Unit,
    completeButtonOnClick: () -> Unit
) {
    Box(
        modifier = Modifier.padding(vertical = 15.dp, horizontal = 15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(NotDoIcon.BackButtonIcon.drawableId),
                contentDescription = NotDoIcon.BackButtonIcon.contentDescription,
                modifier = Modifier.notDoClickable(false) { onBackPressed() }
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            NotDoFont.Title(
                text = "일기 작성",
                fontWeight = FontWeight.SemiBold
            )
        }
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {
            NotDoFont.Title(
                text = "완료",
                color = NotDoColor.Gray500,
                modifier = Modifier.notDoClickable { completeButtonOnClick() })
        }
    }
}

@Composable
fun NormalHeader(
    title: String,
    onBackPressed: () -> Unit
) {
    Box(
        modifier = Modifier.padding(vertical = 15.dp, horizontal = 15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(NotDoIcon.BackButtonIcon.drawableId),
                contentDescription = NotDoIcon.BackButtonIcon.contentDescription,
                modifier = Modifier.notDoClickable(false) { onBackPressed() }
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            NotDoFont.Hedline2(
                text = title
            )
        }
    }
}

