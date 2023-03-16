plugins {
    id("java")
    id("io.spring.dependency-management") version "1.1.0"
    id("org.springframework.boot") version "3.0.4" apply false
    kotlin("jvm") version "1.8.10" apply false
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":web"))
    implementation(project(":logic"))
    implementation(project(":database"))
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = "com.demo"
    version = "0.0.1-SNAPSHOT"

    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}


