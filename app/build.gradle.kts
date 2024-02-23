plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

}
android {
    namespace = "com.flyfish233.projectdelilah.pride"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.flyfish233.projectdelilah.pride"
        versionCode = 101
        versionName = "1.0.1"
        // Prevents kids to install the app because of the age 33+ content lol
        minSdk = 33
    }

    kotlin {
        jvmToolchain(17)
    }

    buildTypes {
        release {
            isMinifyEnabled = true
        }
        debug {
            isMinifyEnabled = true
        }
    }
}
