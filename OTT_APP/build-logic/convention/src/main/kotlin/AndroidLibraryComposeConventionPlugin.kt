
import com.android.build.api.dsl.LibraryExtension
import com.ott.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

internal class AndroidLibraryComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

           val extension = extensions.getByType(LibraryExtension::class.java)
           configureAndroidCompose(extension)
        }
    }
}