object Dependency {
    object Gradle {
        const val APPLICATION = "com.android.application"
        const val LIBRARY = "com.android.library"
        const val KOTLIN = "org.jetbrains.kotlin.android"
    }

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val LIFECYCLE_KTX =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    }

    object Compose {
        const val ACTIVITY_COMPOSE =
            "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val COMPOSE_MATERIAL =
            "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}"
    }

    object Google {
        const val ANDROID_MATERIAL =
            "com.google.android.material:material:${Versions.ANDROID_MATERIAL}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    }

    object ComposeTest {
        const val COMPOSE_TEST = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
        const val DEBUG_COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val DEBUG_COMPOSE_TEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}"
    }
}