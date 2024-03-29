plugins {
    id("com.gradle.enterprise") version "3.16.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

gradleEnterprise {
    buildScan {
        tag("frontend-engineer")
    }
}

rootProject.name = "java-learning"
