plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
    alias(libs.plugins.ott.android.hilt)
    alias(libs.plugins.kotlin.serialization)
}
android {
    namespace = "ott.core.common"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
    implementation(libs.androidx.navigation3.runtime)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}