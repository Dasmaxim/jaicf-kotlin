plugins {
    `jaicf-github-release`
}

allprojects {
    group = "com.just-ai.jaicf"
    version = "1.2.2"

    repositories {
        mavenCentral()
        maven(uri("https://jitpack.io"))
        google()
    }
}
