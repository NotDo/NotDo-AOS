buildscript {
    dependencies {
        classpath(Dependency.Gradle.GRADLE_HILT)
    }
}

plugins {
    id(Dependency.Gradle.APPLICATION) version Versions.APPLICATION apply false
    id(Dependency.Gradle.LIBRARY) version Versions.LIBRARY apply false
    id(Dependency.Gradle.KOTLIN) version Versions.KOTLIN apply false
}