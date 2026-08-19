
plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.hilt)
}

android{
    namespace = "ott.core.session"
}
dependencies {
    implementation(libs.androidx.dataStore.preferences)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}