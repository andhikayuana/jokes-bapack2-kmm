pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.equals("com.spotify.ruler")) {
                useModule("com.spotify.ruler:ruler-gradle-plugin:1.4.0")
            }
        }
    }
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "JokesBapack2_KMM"
include(":androidApp")
include(":shared")