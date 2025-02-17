// Application module: app/build.gradle.kts

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.dav" // ✅ Correct package structure
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dav"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled(false) // ✅ Fix placement issue
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            minifyEnabled(false)
        }
    }

    buildFeatures {
        compose = true // ✅ Enable Jetpack Compose
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.material3:material3:1.1.2")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
