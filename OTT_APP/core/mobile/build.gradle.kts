plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
}
android {
    namespace = "ott.core.mobile"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
}