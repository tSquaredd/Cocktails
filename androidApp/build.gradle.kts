plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}
group = "com.tsquaredapps.cocktails"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(":shared"))
    implementation(Deps.Material.android)
    implementation(Deps.AppCompat.core)
    implementation(Deps.ConstraintLayout.core)
}
android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = "com.tsquaredapps.cocktails.androidApp"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}