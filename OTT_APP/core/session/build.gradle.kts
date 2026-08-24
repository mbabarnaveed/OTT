
plugins {
    alias(libs.plugins.ott.android.library)
    alias(libs.plugins.ott.android.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android{
    namespace = "ott.core.session"
}
dependencies {
    implementation(libs.androidx.dataStore.preferences)
    implementation(libs.kotlinx.serialization.json)
}