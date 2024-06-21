plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.gratom"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.commons/commons-csv
    implementation("org.apache.commons:commons-csv:1.11.0")

    // Dec is a simple wrapper around BigDecimal
    implementation("io.github.rtmigo:dec:0.1.8")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
