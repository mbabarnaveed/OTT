plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
}
android {
    namespace = "ott.core.designsystem"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
}