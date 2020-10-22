buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath(Deps.androidGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")
    }
}
group = "com.tsquaredapps.cocktails"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
