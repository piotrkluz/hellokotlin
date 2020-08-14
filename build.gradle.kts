plugins {
    kotlin("jvm") version "1.3.72"
}

group = "io.github.piotrkluz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
}
