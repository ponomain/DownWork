rootProject.name = "DownWork"


pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}
include("down-work-service")
