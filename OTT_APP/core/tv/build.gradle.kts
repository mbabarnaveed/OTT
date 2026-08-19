plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.compose)
}
android {
    namespace = "ott.core.tv"
}

dependencies{
    implementation(libs.kotlinx.immutable)
    implementation(libs.androidx.core)
    implementation(project(":core:common"))
    implementation(libs.androidx.navigation3.runtime)
    implementation(libs.androidx.navigation3.ui)
    implementation(libs.navigation3.ui)
}