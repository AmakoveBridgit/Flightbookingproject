plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.bridgitamakove.flightbookingproject"
    compileSdk = 34


    buildFeatures {
        dataBinding=true
    }
    defaultConfig {
        applicationId = "com.bridgitamakove.flightbookingproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

        implementation ("com.google.android.material:material:1.8.0")
        implementation ("androidx.activity:activity-ktx:1.7.2")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
        testImplementation ("junit:junit:4.13.2")
        androidTestImplementation ("androidx.test.ext:junit:1.1.5")
        androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation ("com.google.code.gson:gson:2.8.8")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

}


