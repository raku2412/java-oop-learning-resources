import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.fat.jar)
}

kotlin {
    jvm("desktop")
    
    sourceSets {
        val desktopMain by getting
        
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtimeCompose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutinesSwing)
        }
    }
}


compose.desktop {
    application {
        mainClass = "de.kuhlmann.raphael.exampreparation.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "de.kuhlmann.raphael.exampreparation"
            packageVersion = "1.0.0"
        }
    }
}

tasks.register<ShadowJar>("fatJar") {
    archiveBaseName.set("ExamPreparation")
    archiveClassifier.set("")
    archiveVersion.set("1.0.0")
    manifest {
        attributes["Main-Class"] = "de.kuhlmann.raphael.exampreparation.MainKt"
    }
    from(kotlin.targets.getByName("desktop").compilations.getByName("main").output)
    configurations = listOf(kotlin.targets.getByName("desktop").compilations.getByName("main").runtimeDependencyFiles)
}
