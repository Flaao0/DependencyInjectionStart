package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.database.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.database.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.network.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.network.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module


@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}