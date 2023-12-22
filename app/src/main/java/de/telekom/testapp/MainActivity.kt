package de.telekom.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import okhttp3.internal.publicsuffix.PublicSuffixDatabase
import okio.Path.Companion.toPath

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val PUBLIC_SUFFIX_RESOURCE =
            "/${PublicSuffixDatabase::class.qualifiedName?.replace(".", "/")}.gz".toPath()

        println("path: $PUBLIC_SUFFIX_RESOURCE")

        PublicSuffixDatabase.get().getEffectiveTldPlusOne("com")
    }
}
