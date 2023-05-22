plugins {
    id(Dependency.Gradle.APPLICATION)
    id(Dependency.Gradle.KOTLIN)
    id(Dependency.Plugins.HILT_PLUGIN)
    id(Dependency.Plugins.KAPT)
}

@Suppress("UnstableApiUsage")
android {
    namespace = "com.notdo.aos"
    compileSdk = Versions.COMPILESDK

    defaultConfig {
        applicationId = "com.notdo.aos"
        minSdk = Versions.MINSDK
        targetSdk = Versions.TARGETSDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    //signup
    implementation(project(":feature-ui-signup"))
    implementation(project(":feature-domain-signup"))
    implementation(project(":feature-data-signup"))

    implementation(project(":feature-ui-intro"))
    implementation(project(":feature-ui-signin"))
    implementation(project(":feature-ui-findpassword"))
    implementation(project(":feature-ui-main"))


    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.LIFECYCLE_KTX)
    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE_UI)
    implementation(Dependency.Compose.COMPOSE_TOOLING)
    implementation(Dependency.Compose.COMPOSE_MATERIAL)
    implementation(Dependency.Compose.COMPOSE_NAV)
    implementation(Dependency.AndroidX.LIFECYCLE_VIEWMODEL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO)
    androidTestImplementation(Dependency.ComposeTest.COMPOSE_TEST)
    debugImplementation(Dependency.ComposeTest.DEBUG_COMPOSE_TOOLING)
    debugImplementation(Dependency.ComposeTest.DEBUG_COMPOSE_TEST)

    //Hilt
    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)
}