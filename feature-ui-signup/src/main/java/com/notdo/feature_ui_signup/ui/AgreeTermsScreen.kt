package com.notdo.feature_ui_signup.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.notdo.feature_ui_signup.ui.component.CheckBox
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.component.GreetingsNotDoView
import com.notdo.util_ui.component.NormalHeader
import com.notdo.util_ui.component.NotDoButton
import com.notdo.util_ui.font.NotDoFont
import com.notdo.util_ui.icon.NotDoIcon
import com.notdo.util_ui.modifier.notDoClickable
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AgreeTermsScreen(navController: NavController) {
    var isAgreeTremsChecked by remember {
        mutableStateOf(false)
    }
    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val coroutineScope = rememberCoroutineScope()

    ModalBottomSheetLayout(
        sheetContent = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(modifier = Modifier.fillMaxWidth(0.9f)) {
                    Spacer(modifier = Modifier.size(24.dp))
                    Box {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            NotDoFont.Hedline1(text = "개인정보 처리방침", fontWeight = FontWeight.Medium)
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Icon(
                                painter = painterResource(NotDoIcon.CloseButtonIcon.drawableId),
                                contentDescription = NotDoIcon.CloseButtonIcon.contentDescription,
                                modifier = Modifier.notDoClickable(false) {
                                    coroutineScope.launch {
                                        bottomSheetState.hide()
                                    }
                                }
                            )
                        }
                    }
                    Spacer(modifier = Modifier.fillMaxHeight(0.05f))
                    NotDoFont.Title(text = "낫두의 개인정보 처리방침", fontWeight = FontWeight.SemiBold)
                    Spacer(modifier = Modifier.size(11.dp))
                    NotDoFont.Body(text = "낫두(Not Do)는 개인정보보호법을 준수하며, 관련 법령에 의거한 개인정보처리방침을 정하여 이용자 권익 보호에 최선을 다하고 있습니다.회사의 개인정보처리방침은 다음과 같은 내용을 담고 있습니다.")
                    Spacer(modifier = Modifier.fillMaxHeight(0.05f))
                    NotDoFont.Title(text = "1. 개인정보의 제3자 동의", fontWeight = FontWeight.SemiBold)
                    Spacer(modifier = Modifier.size(11.dp))
                    NotDoFont.Body(
                        text = "회사는 개인정보를 \"1. 개인정보의 처리목적 및 수집항목\"에서 고지한 범위내에서 사용하며, 정보주체의 사전 동의 없이는 동 범위를 초과하여 이용하거나 원칙적으로 개인정보를 외부에 공개하지 않습니다. 다만, 아래의 경우에는 예외로 합니다.\n" +
                                "- 정보주체가 사전에 동의한 경우\n" +
                                "- 법령의 규정에 의거하거나, 수사 목적으로 법령에 정해진 절차와 방법에 따라 수사기관의 요구가 있는 경우\n" +
                                "간혹 입사 지원자에게 회사와 특수관계에 있는 회사(자회사, 계열사 등)에 입사제안을 드릴 수 있으며, 이 경우 반드시 사전에 입사 지원자에게 개별 연락하여 동의 절차를 거친 후 입사 지원서를 해당 회사로 이관합니다."
                    )
                }
            }
        },
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NormalHeader(title = "회원가입") {
                navController.navigate(NotDoRoutes.INTRO_ROUTE)
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            GreetingsNotDoView(text = "낫두가 \n처음이시군요?")
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            NotDoFont.Caption2(
                text = "약관동의",
                fontWeight = FontWeight.Normal,
                modifier = Modifier.fillMaxWidth(0.9f)
            )
            Spacer(modifier = Modifier.size(10.dp))
            Row(modifier = Modifier.fillMaxWidth(0.9f)) {
                CheckBox {
                    isAgreeTremsChecked = it
                }
                Spacer(modifier = Modifier.size(10.dp))
                Column {
                    NotDoFont.Title(text = "개인정보 3자 제공 동의")
                    Spacer(modifier = Modifier.size(6.dp))
                    NotDoFont.Caption1(
                        text = "자세히 보기",
                        color = NotDoColor.Gray500,
                        modifier = Modifier.notDoClickable {
                            coroutineScope.launch {
                                bottomSheetState.show()
                            }
                        })
                }
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
                NotDoButton(text = "다음", isActivation = isAgreeTremsChecked) {
                    navController.navigate(NotDoRoutes.SignUp.EMAIL_INPUT_SCREEN)
                }
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            }
        }
    }
}
