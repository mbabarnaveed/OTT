import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import com.ott.constants.Version

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ott.android.hilt)
    id("kotlinx-serialization")
}
android {
    namespace = "com.ott.stb"
    compileSdk = Version.COMPILE_SDK
    defaultConfig {
        applicationId = "ott.starz.mobile"
        minSdk =Version.MINS_DK
        targetSdk = Version.COMPILE_SDK
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = Version.JAVA_VERSION
        targetCompatibility = Version.JAVA_VERSION
    }
    buildFeatures {
        compose = true
    }
    val date = SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(Date())
    flavorDimensions += "tenant"
    productFlavors {

        create("bulgaria") {
            dimension = "tenant"
            applicationId = project.findProperty("ethanol.applicationId.bulgaria.stb") as String
            versionCode = project.findProperty("ethanol.versionCode.bulgaria.stb")?.toString()?.toIntOrNull() ?: 1
            versionName = "${project.findProperty("ethanol.versionName.bulgaria.stb")}$date"
        }

        create("serbia") {
            dimension = "tenant"
            applicationId = project.findProperty("ethanol.applicationId.serbia.stb") as String
            versionCode = project.findProperty("ethanol.versionCode.serbia.stb")?.toString()?.toIntOrNull() ?: 1
            versionName = "${project.findProperty("ethanol.versionName.serbia.stb")}$date"
        }

        create("slovakia") {
            dimension = "tenant"
            applicationId = project.findProperty("ethanol.applicationId.slovakia.stb") as String
            versionCode = project.findProperty("ethanol.versionCode.slovakia.stb")?.toString()?.toIntOrNull() ?: 1
            versionName = "${project.findProperty("ethanol.versionName.slovakia.stb")}$date"
        }

        create("hungaria") {
            dimension = "tenant"
            applicationId = project.findProperty("ethanol.applicationId.hungaria.stb") as String
            versionCode = project.findProperty("ethanol.versionCode.hungaria.stb")?.toString()?.toIntOrNull() ?: 1
            versionName = "${project.findProperty("ethanol.versionName.hungaria.stb")}$date"
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-dev"
            isDebuggable = true
        }
        create("staging") {
            initWith(getByName("debug"))
            applicationIdSuffix = ".staging"
            versionNameSuffix = "-preprod"
            matchingFallbacks += listOf("debug")
        }
        release {
            isMinifyEnabled = true
            isDebuggable = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }


}
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.coil.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.google.gson)
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.hilt.navigation.compose)

    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}