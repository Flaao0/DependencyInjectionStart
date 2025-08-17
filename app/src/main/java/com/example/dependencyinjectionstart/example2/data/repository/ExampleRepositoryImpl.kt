package com.example.dependencyinjectionstart.example2.data.repository

import com.example.dependencyinjectionstart.example2.data.database.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.example.dependencyinjectionstart.example2.data.network.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}