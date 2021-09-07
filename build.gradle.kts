plugins {
    java
}

group = "com.eventloopsoftware"
version = "1.0-SNAPSHOT"

val kotlinVersion: String by project
val log4jVersion: String by project
val flinkVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    // Flink
    implementation("org.apache.flink:flink-java:$flinkVersion")
    implementation("org.apache.flink:flink-streaming-java_2.12:$flinkVersion")
    implementation("org.apache.flink:flink-walkthrough-common_2.12:$flinkVersion")
    implementation("org.apache.flink:flink-clients_2.12:$flinkVersion")

    // logging
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-slf4j18-impl:$log4jVersion")

    // test
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}