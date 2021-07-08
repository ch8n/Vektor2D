plugins {
    id("java")
    kotlin("jvm") version "1.5.10"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

group = "com.github.ch8n"
version = "1.0"

dependencies {
    implementation(kotlin("stdlib"))
    project(":vektor2d")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
