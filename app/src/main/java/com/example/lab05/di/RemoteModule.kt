package com.example.lab05.di

import com.example.lab05.data.Lab05API
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RemoteModule {
    @Provides
    @Singleton
    fun provideLab05API(): Lab05API {
        return Retrofit.Builder()
            .baseUrl()
    }
}