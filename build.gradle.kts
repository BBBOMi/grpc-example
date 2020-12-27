import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm") version "1.4.10"

    id("com.google.protobuf") version "0.8.14"
    id("java")
}

group = "me.study"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.grpc:grpc-all:1.34.1")
    implementation("io.grpc:grpc-netty-shaded:1.34.1")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

sourceSets {
    main {
        java {
            srcDirs("gen-src/main/java", "gen-src/main/grpc")
        }
    }
}


protobuf {
    generatedFilesBaseDir = "$projectDir/gen-src"

    protoc {
        artifact = "com.google.protobuf:protoc:3.10.1"
    }

    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.25.0"
        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach{
            it.plugins {
                id("grpc")
            }
        }
    }
}