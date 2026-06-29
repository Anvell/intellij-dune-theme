plugins {
    id("java")
    id("org.jetbrains.intellij.platform")
}

group = "io.github.anvell"
version = "3.4.0"

dependencies {
    intellijPlatform {
        intellijIdea("2026.1.3")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "241"
        }
    }
}

tasks {
    buildSearchableOptions {
        enabled = false
    }
}
