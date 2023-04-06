package com.notdo.util_kotlin.format

import java.util.regex.Pattern

fun String.isEmailPattern(): Boolean {
    val emailPattern = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+\$"
    val compiledPattern = Pattern.compile(emailPattern)
    return !compiledPattern.matcher(this).find()
}