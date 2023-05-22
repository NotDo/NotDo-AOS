pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "NotDoAos"
include(":app")
include(":navigator")
include(":util-ui")
include(":util-db")
include(":util-network")
include(":util-kotlin")
include(":feature-ui-intro")
include(":feature-domain-intro")
include(":feature-domain-signup")
include(":feature-ui-signup")
include(":feature-domain-signin")
include(":feature-ui-signin")
include(":feature-domain-main")
include(":feature-ui-main")
include(":feature-ui-findpassword")
include(":feature-domain-findpassword")
include(":feature-data-signup")
