object Versions {
    val kotlin = "1.4.10"
    val ktor = "1.4.0"
    val coroutines = "1.4.0-M1"
    val serialization = "1.0.0"
    val androidxTest = "1.2.0"
    val androidxTestExt = "1.1.1"
    val koin = "2.1.6"

    val minSdk = 24
    val targetSdk = 29
    val compileSdk = 29

    val material = "1.2.1"
    val appCompat = "1.2.0"
    val constraintLayout = "2.0.2"
    val androidGradlePlugin = "4.0.1"
}

object Deps {

    val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    object Ktor {
        val commonCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        val commonJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        val commonLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        val jvmCore = "io.ktor:ktor-client-core-jvm:${Versions.ktor}"
        val androidCore = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        val jvmJson = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
        val jvmLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
        val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
        val iosCore = "io.ktor:ktor-client-core-native:${Versions.ktor}"
        val iosJson = "io.ktor:ktor-client-json-native:${Versions.ktor}"
        val iosLogging = "io.ktor:ktor-client-logging-native:${Versions.ktor}"
        val commonSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        val androidSerialization = "io.ktor:ktor-client-serialization-jvm:${Versions.ktor}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object AndroidXTest {
        val core = "androidx.test:core:${Versions.androidxTest}"
        val junit = "androidx.test.ext:junit:${Versions.androidxTestExt}"
        val runner = "androidx.test:runner:${Versions.androidxTest}"
        val rules = "androidx.test:rules:${Versions.androidxTest}"
    }

    object Koin {
        val core = "org.koin:koin-core:${Versions.koin}"
        val test = "org.koin:koin-test:${Versions.koin}"
    }

    object Material {
        val android = "com.google.android.material:material:${Versions.material}"
    }

    object AppCompat {
        val core = "androidx.appcompat:appcompat:${Versions.appCompat}"
    }

    object ConstraintLayout {
        val core = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }
}