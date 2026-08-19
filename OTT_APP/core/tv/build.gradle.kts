plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
    alias(libs.plugins.ott.android.hilt)
}
android {
    namespace = "ott.core.tv"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
    implementation(project(":core:common"))
}