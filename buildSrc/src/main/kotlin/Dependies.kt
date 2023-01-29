object Versions {
    const val core = "1.9.0"
    const val appCompact = "1.5.1"
    const val material = "1.7.0"
    const val constraintLayout = "2.1.4"
    const val junit = "4.13.2"
    const val androidJunit = "1.1.4"
    const val espressoCore = "3.5.0"
    const val room = "2.4.3"
    const val AGP = "7.3.0"
    const val kotlin = "1.7.10"
}

object Dependencies {

    object UI {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val appCompact = "androidx.appcompat:appcompat:${Versions.appCompact}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout ="androidx.constraintlayout:${Versions.constraintLayout}"
        const val junit = "junit:junit:${Versions.junit}"
        const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"


    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val room = "androidx.room:room-ktx:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
    }


    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }
}

object Plugins {
    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val java = "java-library"
    }

    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
        const val jvm = "org.jetbrains.kotlin.jvm"

    }

    object DaggerHilt {
        const val hilt = "com.google.dagger.hilt.android"
    }

    object Java {
        const val java = "java-library"
    }
}