plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.fredprojects.sunschool"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.fredprojects.sunschool"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(libs.bundles.network)
    implementation(libs.bundles.room)
    ksp(libs.androidx.room.compiler)
    implementation(libs.bundles.app)
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.android.test)
}