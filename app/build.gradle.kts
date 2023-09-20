plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.myapplicationparajugar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplicationparajugar"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("com.google.dagger:hilt-android:2.48")
    ksp("com.google.dagger:hilt-android-compiler:2.47")
    implementation( "androidx.hilt:hilt-navigation-compose:1.0.0")


    implementation( "androidx.navigation:navigation-fragment-ktx:2.7.2")
    implementation( "androidx.navigation:navigation-ui-ktx:2.7.2")

    // Feature module Support
    implementation( "androidx.navigation:navigation-dynamic-features-fragment:2.7.2")

    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:2.7.2")

    // Jetpack Compose Integration
    implementation( "androidx.navigation:navigation-compose:2.7.2")

    ///// Navigation DSL
    api ("androidx.navigation:navigation-fragment-ktx:2.7.2")


    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation ("com.squareup.retrofit2:converter-protobuf:2.9.0")
    implementation("com.squareup.retrofit2:retrofit-mock:2.9.0")

    implementation("androidx.room:room-runtime:2.5.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")

    // To use Kotlin Symbol Processing (KSP)
    ksp("androidx.room:room-compiler:2.5.2")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.5.2")

    // optional - RxJava2 support for Room
    implementation("androidx.room:room-rxjava2:2.5.2")

    // optional - RxJava3 support for Room
    implementation("androidx.room:room-rxjava3:2.5.2")

    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation("androidx.room:room-guava:2.5.2")

    // optional - Test helpers
    testImplementation("androidx.room:room-testing:2.5.2")

    // optional - Paging 3 Integration
    implementation("androidx.room:room-paging:2.5.2")

    val lifecycle_version = "2.6.2"
    val arch_version = "2.2.0"

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // ViewModel utilities for Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Lifecycles only (without ViewModel or LiveData)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    // Lifecycle utilities for Compose
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$lifecycle_version")

    // Saved state module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    // Annotation processor
   ////////// ksp("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
    // alternately - if using Java8, use the following instead of lifecycle-compiler
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    // optional - helpers for implementing LifecycleOwner in a Service
    implementation("androidx.lifecycle:lifecycle-service:$lifecycle_version")

    // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
    implementation("androidx.lifecycle:lifecycle-process:$lifecycle_version")

    // optional - ReactiveStreams support for LiveData
    implementation("androidx.lifecycle:lifecycle-reactivestreams-ktx:$lifecycle_version")

    // optional - Test helpers for LiveData
    testImplementation("androidx.arch.core:core-testing:$arch_version")

    // optional - Test helpers for Lifecycle runtime
    testImplementation ("androidx.lifecycle:lifecycle-runtime-testing:$lifecycle_version")



    val composeBom = platform("androidx.compose:compose-bom:2023.08.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    // Material Design 3
    implementation("androidx.compose.material3:material3")
    // Android Studio Preview support
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Optional - Integration with activities
    implementation("androidx.activity:activity-compose:1.7.2")
    // Optional - Integration with ViewModels
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    // Optional - Integration with LiveData
    implementation("androidx.compose.runtime:runtime-livedata")


    val paging_version = "3.2.1"

    implementation("androidx.paging:paging-runtime-ktx:$paging_version")

    // alternatively - without Android dependencies for tests
    testImplementation("androidx.paging:paging-common-ktx:$paging_version")

    // optional - RxJava2 support
    implementation("androidx.paging:paging-rxjava2-ktx:$paging_version")

    // optional - RxJava3 support
    implementation("androidx.paging:paging-rxjava3:$paging_version")

    // optional - Guava ListenableFuture support
    implementation("androidx.paging:paging-guava:$paging_version")

    // optional - Jetpack Compose integration
    implementation("androidx.paging:paging-compose:3.2.1")



    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // optional - RxJava2 support
    implementation("androidx.datastore:datastore-preferences-rxjava2:1.0.0")

    // optional - RxJava3 support
    implementation("androidx.datastore:datastore-preferences-rxjava3:1.0.0")



    val work_version = "2.8.1"

    // (Java only)
    implementation("androidx.work:work-runtime:$work_version")

    // Kotlin + coroutines
    implementation("androidx.work:work-runtime-ktx:$work_version")

    // optional - RxJava2 support
    implementation("androidx.work:work-rxjava2:$work_version")

    // optional - GCMNetworkManager support
    implementation("androidx.work:work-gcm:$work_version")

    // optional - Test helpers
    androidTestImplementation("androidx.work:work-testing:$work_version")

    // optional - Multiprocess support
    implementation ("androidx.work:work-multiprocess:$work_version")

    /*
        // Choose one of the following:

        // or Material Design 2
        implementation("androidx.compose.material:material")
        // or skip Material Design and build directly on top of foundational components
        implementation("androidx.compose.foundation:foundation")
        // or only import the main APIs for the underlying toolkit systems,
        // such as input and measurement/layout
        implementation("androidx.compose.ui:ui")

        // Optional - Included automatically by material, only add when you need
        // the icons but not the material library (e.g. when using Material3 or a
        // custom design system based on Foundation)
        implementation("androidx.compose.material:material-icons-core")
        // Optional - Add full set of material icons
        implementation("androidx.compose.material:material-icons-extended")
        // Optional - Add window size utils
        implementation("androidx.compose.material3:material3-window-size-class")

        // Optional - Integration with RxJava
        implementation("androidx.compose.runtime:runtime-rxjava2")
     */

    ////// COROUTINES
    implementation( "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    //////SPLASHSCREEN
    implementation( "androidx.core:core-splashscreen:1.0.1")

    //// External Libraries
    implementation( "com.google.code.gson:gson:2.10.1")
    implementation( "com.github.bumptech.glide:glide:4.15.1")
    // Skip this if you don"t want to use integration libraries or configure Glide.
    /////////////////annotationProcessor "com.github.bumptech.glide:compiler:4.12.0"

    /////implementation( "com.squareup.picasso:picasso:2.71828"

    implementation("com.squareup.moshi:moshi:1.15.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.squareup.moshi:moshi-adapters:1.15.0")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")

    ////okhttp
    ////implementation(("com.squareup.okhttp3:okhttp:4.9.3")
    ////testimplementation(("com.squareup.okhttp3:mockwebserver:4.9.3")

    ////okio
    ////implementation(("com.squareup.okio:okio:3.0.0")

    //// Acompaniest
    implementation( "com.google.accompanist:accompanist-insets:0.30.1")
    // If using insets-ui
    implementation( "com.google.accompanist:accompanist-insets-ui:0.30.1")
    implementation( "com.google.accompanist:accompanist-systemuicontroller:0.30.1")
    implementation( "com.google.accompanist:accompanist-appcompat-theme:0.30.1")
    implementation( "com.google.accompanist:accompanist-pager:0.30.1")

    // If using indicators, also depend on
    implementation( "com.google.accompanist:accompanist-pager-indicators:0.30.1")
    implementation( "com.google.accompanist:accompanist-swiperefresh:0.30.1")
    // If you"re using Material, use accompanist-placeholder-material
    implementation( "com.google.accompanist:accompanist-placeholder-material:0.30.1")
    // Otherwise use the foundation version
    implementation( "com.google.accompanist:accompanist-placeholder:0.30.1")
    implementation( "com.google.accompanist:accompanist-drawablepainter:0.30.1")
    implementation( "com.google.accompanist:accompanist-flowlayout:0.30.1")
    implementation( "com.google.accompanist:accompanist-permissions:0.30.1")
    implementation( "com.google.accompanist:accompanist-navigation-animation:0.30.1")
    implementation( "com.google.accompanist:accompanist-navigation-material:0.30.1")
    implementation( "com.google.accompanist:accompanist-webview:0.30.1")

    implementation("io.coil-kt:coil:2.4.0")
    implementation("io.coil-kt:coil-compose:2.4.0")

    implementation( "com.jakewharton.timber:timber:5.0.1")

    implementation( "io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation( "io.reactivex.rxjava3:rxjava:3.1.6")
    implementation( "io.reactivex.rxjava3:rxkotlin:3.0.1")

    implementation( "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    implementation( "io.ktor:ktor-client-core:2.3.3")
    implementation( "io.ktor:ktor-client-cio:2.3.3")
    implementation( "io.ktor:ktor-client-content-negotiation:2.3.3")
    implementation( "io.ktor:ktor-serialization-kotlinx-json:2.3.3")
    implementation( "io.ktor:ktor-serialization-gson:2.3.3")

}