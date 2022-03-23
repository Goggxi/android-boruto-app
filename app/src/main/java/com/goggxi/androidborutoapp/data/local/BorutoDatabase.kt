package com.goggxi.androidborutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.goggxi.androidborutoapp.domain.model.Hero

@Database(entities = [Hero::class],  version = 1)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao


}