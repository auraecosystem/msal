dependencies {
    // Shared across all flavors
    implementation("androidx.core:core-ktx:1.13.1")

    // Flavor-specific dependencies
    "localImplementation"("com.auraecosystem:common:1.0.0-SNAPSHOT")
    "snapshotImplementation"("com.auraecosystem:common:1.0.0-SNAPSHOT")
    "distImplementation"("com.auraecosystem:common:1.0.0")
}
