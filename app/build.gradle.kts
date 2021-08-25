plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.30"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.5.30"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
    application
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-serialization:1.6.2")
    implementation("io.ktor:ktor-server-core:1.6.2")
    implementation("io.ktor:ktor-server-tomcat:1.6.2")
    testImplementation("io.ktor:ktor-server-test-host:1.6.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClass.set("hu.netcode.ktorkotlindemo.ApplicationKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
}
