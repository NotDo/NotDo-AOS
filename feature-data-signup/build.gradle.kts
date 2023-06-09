plugins {
    id(Dependency.Gradle.LIBRARY)
    id(Dependency.Gradle.KOTLIN)
    id(Dependency.Plugins.HILT_PLUGIN)
    kotlin(Dependency.Gradle.KAPT)
}

@Suppress("UnstableApiUsage")
android {
    namespace = "com.notdo.feature_data_signup"
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
}

dependencies {
    implementation(project(":util-network"))
    implementation(project(":feature-domain-signup"))

    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.APPCOMPAT)
    implementation(Dependency.Google.ANDROID_MATERIAL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO)

    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)

    implementation(Dependency.Library.RETROFIT)
    implementation(Dependency.Library.OKHTTP)
    implementation(Dependency.Library.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Dependency.Library.RETROFIT_GSON_CONVERTER)
}