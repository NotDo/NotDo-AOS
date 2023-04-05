package com.notdo.util_ui.util

import java.util.regex.Pattern

object Utils {
    fun checkEmailPatternIsError(email: String): Boolean {
        val emailPattern = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+\$"
        val compiledPattern = Pattern.compile(emailPattern)
        return !compiledPattern.matcher(email).find()
    }

    fun checkPasswordPatternIsError(password: String): Boolean {
        val passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@!%*#?&])[A-Za-z\\d@!%*#?&]{8,}\$"
        val compiledPattern = Pattern.compile(passwordPattern)
        return !compiledPattern.matcher(password).find()
    }
}