package com.goggxi.androidborutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.goggxi.androidborutoapp.data.local.BorutoDatabase
import com.goggxi.androidborutoapp.utils.Constant.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) : RoomDatabase {
        return Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()
    }
}