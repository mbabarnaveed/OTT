plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
    alias(libs.plugins.ott.android.hilt)
}
android {
    namespace = "ott.core.designsystem"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}