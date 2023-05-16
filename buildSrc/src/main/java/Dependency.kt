object Dependency {
    object Gradle {
        const val APPLICATION = "com.android.application"
        const val LIBRARY = "com.android.library"
        const val KOTLIN = "org.jetbrains.kotlin.android"
        const val GRADLE_HILT = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
        const val KAPT = "kapt"
    }

    object Plugins {
        const val HILT_PLUGIN = "dagger.hilt.android.plugin"
        const val KAPT = "kotlin-kapt"
    }

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val LIFECYCLE_KTX =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
        const val LIFECYCLE_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VIEWMODEL}"
    }

    object Compose {
        const val ACTIVITY_COMPOSE =
            "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val COMPOSE_MATERIAL =
            "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}"
        const val COMPOSE_NAV = "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAV}"
    }

    object Library {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_GSON_CONVERTER =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
        const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
        const val ORBIT = "org.orbit-mvi:orbit-viewmodel:${Versions.ORBIT}"
        const val ORBIT_COMPOSE = "org.orbit-mvi:orbit-compose:${Versions.ORBIT}"
        const val SYSTEM_UI_CONTROLLER =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.SYSTEM_UI_CONTROLLER}"
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    }

    object Google {
        const val ANDROID_MATERIAL =
            "com.google.android.material:material:${Versions.ANDROID_MATERIAL}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        const val ORBIT_TEST = "org.orbit-mvi:orbit-test:${Versions.ORBIT}"
        const val ROOM_TESTING = "androidx.room:room-testing:${Versions.ROOM}"
    }

    object ComposeTest {
        const val COMPOSE_TEST = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
        const val DEBUG_COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val DEBUG_COMPOSE_TEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}"
    }
}