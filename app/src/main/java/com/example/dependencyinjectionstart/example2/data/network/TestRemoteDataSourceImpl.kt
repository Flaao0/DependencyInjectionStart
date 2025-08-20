package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {

    override fun method() {
        Log.d("EXAMPLE_TEST", "TestRemoteDataSourceImpl: TEST")
    }
}