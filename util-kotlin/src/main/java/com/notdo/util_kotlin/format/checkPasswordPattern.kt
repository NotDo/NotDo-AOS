package com.notdo.util_kotlin.format

import java.util.regex.Pattern

fun String.isPasswordPattern(): Boolean {
    val passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@!%*#?&])[A-Za-z\\d@!%*#?&]{8,20}\$"
    val compiledPattern = Pattern.compile(passwordPattern)
    return !compiledPattern.matcher(this).find()
}