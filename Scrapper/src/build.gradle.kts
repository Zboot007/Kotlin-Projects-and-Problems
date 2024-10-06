plugins {
    kotlin("jvm") version "1.9.10" // Ensure you use the latest version of Kotlin
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.15.3") // Latest version of Jsoup
    implementation("com.squareup.okhttp3:okhttp:4.10.0") // Latest version of OkHttp
}