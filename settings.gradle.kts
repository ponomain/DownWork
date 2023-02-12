rootProject.name = "DownWork"


pluginManagement {
    val kotlinVersion: String by settings
    val kotestVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        id("io.kotest.multiplatform") version kotestVersion apply false
    }
}
include("down-work-service",
    "down-work-app",
    "down-work-repository",
    "down-work-web")
