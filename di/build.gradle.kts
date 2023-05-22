plugins {
    id(Dependency.Gradle.LIBRARY)
    id(Dependency.Gradle.KOTLIN)
    id(Dependency.Plugins.HILT_PLUGIN)
    id(Dependency.Plugins.KAPT)
}

@Suppress("UnstableApiUsage")
android {
    namespace = "com.notdo.di"
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
    //signup
    implementation(project(":feature-data-signup"))
    implementation(project(":feature-domain-signup"))

    //main
    implementation(project(":feature-domain-main"))


    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.APPCOMPAT)
    implementation(Dependency.Google.ANDROID_MATERIAL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO)

    //Hilt
    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)

    //Retrofit
    implementation(Dependency.Library.RETROFIT)
    implementation(Dependency.Library.RETROFIT_GSON_CONVERTER)

    //Room
    implementation(Dependency.Library.ROOM_RUNTIME)
    implementation(Dependency.Library.ROOM_KTX)
    annotationProcessor(Dependency.Library.ROOM_COMPILER)
    kapt(Dependency.Library.ROOM_COMPILER)
    testImplementation(Dependency.Test.ROOM_TESTING)
}