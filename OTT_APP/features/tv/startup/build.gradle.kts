plugins {
    alias(libs.plugins.ott.android.feature)
    alias(libs.plugins.ott.android.compose)
}

android {
    namespace = "ott.features.tv.startup"
}
dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:design_system"))
    implementation(project(":core:session"))
    implementation(project(":core:tv"))
}