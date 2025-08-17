package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleApiService")
    }
}
