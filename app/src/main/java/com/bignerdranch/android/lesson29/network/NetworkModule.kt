package com.bignerdranch.android.lesson29.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideCharacterApi():CharacterListApi {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.disneyapi.dev")
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(CharacterListApi::class.java)
    }
}