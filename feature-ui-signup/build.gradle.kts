plugins {
    id(Dependency.Gradle.LIBRARY)
    id(Dependency.Gradle.KOTLIN)
    kotlin(Dependency.Gradle.KAPT)
}

@Suppress("UnstableApiUsage")
android {
    namespace = "com.notdo.feature_ui_signup"
    compileSdk = Versions.COMPILESDK

    defaultConfig {
        minSdk = Versions.MINSDK
        targetSdk = Versions.TARGETSDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Versions.JAVAVERSION
        targetCompatibility = Versions.JAVAVERSION
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":navigator"))
    implementation(project(":util-ui"))
    implementation(project(":util-kotlin"))

    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.LIFECYCLE_KTX)
    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE_UI)
    implementation(Dependency.Compose.COMPOSE_TOOLING)
    implementation(Dependency.Compose.COMPOSE_MATERIAL)
    implementation(Dependency.AndroidX.LIFECYCLE_VIEWMODEL)
    implementation(Dependency.Compose.COMPOSE_NAV)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO)
    androidTestImplementation(Dependency.ComposeTest.COMPOSE_TEST)
    debugImplementation(Dependency.ComposeTest.DEBUG_COMPOSE_TOOLING)
    debugImplementation(Dependency.ComposeTest.DEBUG_COMPOSE_TEST)

    //Orbit
    implementation(Dependency.Library.ORBIT)
    implementation(Dependency.Library.ORBIT_COMPOSE)
    testImplementation(Dependency.Test.ORBIT_TEST)

    //Hilt
    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)
}