package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.database.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.database.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.network.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.network.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.network.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @ProdQualifier
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}