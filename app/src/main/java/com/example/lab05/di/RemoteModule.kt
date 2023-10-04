package com.example.lab05.di

import com.example.lab05.data.Lab05API
import com.example.lab05.utilidades.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RemoteModule {
    @Provides
    @Singleton
    fun provideLab05API(): Lab05API {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Lab05API::class.java)
    }
}