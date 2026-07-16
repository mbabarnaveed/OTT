package com.ott.convention

import com.android.build.api.dsl.CommonExtension
import com.ott.constants.Version
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.kotlin.dsl.withType
import org.gradle.kotlin.dsl.configure

/**
 * Configure base Kotlin with Android options
 */
internal fun Project.configureKotlinAndroid(
    commonExtension: CommonExtension,
) {
    commonExtension.apply {
        compileSdk = Version.COMPILE_SDK

        defaultConfig.apply {
            minSdk = Version.MINS_DK
        }

        compileOptions.apply {
            sourceCompatibility = Version.JAVA_VERSION
            targetCompatibility = Version.JAVA_VERSION
            isCoreLibraryDesugaringEnabled = false
        }
    }
    configureKotlin()

    /*dependencies {
        "coreLibraryDesugaring"(libs.findLibrary("android.desugarJdkLibs").get())
    }*/
}

internal fun Project.configureKotlinJvm() {
    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = Version.JAVA_VERSION
        targetCompatibility = Version.JAVA_VERSION
    }
    configureKotlin()
}

internal fun Project.configureKotlin() {
    tasks.withType<KotlinCompile>().configureEach {

        val warningsAsErrors =
            project.findProperty("warningsAsErrors")?.toString()?.toBoolean() ?: false

        compilerOptions {
            jvmTarget.set(Version.JVM_TARGET)
            allWarningsAsErrors.set(warningsAsErrors)

            freeCompilerArgs.addAll(
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
            )
        }
    }
}
