plugins {
    `java-library`
}

group = "net.tim203.tests"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api("io.avaje:avaje-inject:8.13-RC3")
    annotationProcessor("io.avaje:avaje-inject-generator:8.13-RC3")

    testImplementation("io.avaje:avaje-inject-test:8.13-RC3")
    testAnnotationProcessor("io.avaje:avaje-inject-generator:8.13-RC3")
}