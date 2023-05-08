package com.notdo.navigator

object NotDoRoutes {
    const val INTRO_ROUTE = "intro"
    const val SIGNUP_ROUTE = "signUp"
    const val SIGNIN_ROUTE = "signIn"
    const val FIND_PASSWORD_ROUTE = "findPassword"
    const val MAIN_ROUTE = "main"

    object Intro {
        const val MAIN_SCREEN = "intro-MAIN_SCREEN"
    }

    object SignUp {
        const val AGREE_TERMS_SCREEN = "signUp-AGREE_TERMS_SCREEN"
        const val EMAIL_INPUT_SCREEN = "signUp-EMAIL_INPUT_SCREEN"
        const val EMAIL_CODE_CHECK_SCREEN = "signUp-EMAIL_CODE_CHECK_SCREEN"
        const val PASSWORD_INPUT_SCREEN = "signUp-PASSWORD_INPUT_SCREEN"
    }

    object SignIn {
        const val SIGNIN_SCREEN = "signIn-SIGNIN_SCREEN"
    }

    object FindPassword {
        const val EMAIL_INPUT_SCREEN = "findPassword-EMAIL_INPUT_SCREEN"
        const val EMAIL_CODE_CHECK_SCREEN = "findPassword-EMAIL_CODE_CHECK_SCREEN"
        const val RESET_PASSWORD_SCREEN = "findPassword-RESET_PASSWORD_SCREEN"
    }

    object Main {
        const val MAIN_SCREEN = "main-MAIN_SCREEN"
    }
}