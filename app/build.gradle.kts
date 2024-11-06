plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.lab6"
    compileSdk = 34

    viewBinding {
        enable = true
    }

    defaultConfig {
        applicationId = "com.example.lab6"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        var room_version = "2.4.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.recyclerview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.recyclerview)
    implementation ("androidx.recyclerview:recyclerview:1.2.1")

    val room_version = "2.4.2"
    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor ("androidx.room:room-compiler:$room_version")
}