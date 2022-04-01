package com.goggxi.androidborutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.goggxi.androidborutoapp.data.local.dao.HeroDao
import com.goggxi.androidborutoapp.data.local.dao.HeroRemoteKeysDao
import com.goggxi.androidborutoapp.domain.model.Hero
import com.goggxi.androidborutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class],  version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao

}