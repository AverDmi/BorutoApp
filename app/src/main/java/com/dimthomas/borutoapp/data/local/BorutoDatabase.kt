package com.dimthomas.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dimthomas.borutoapp.data.local.dao.HeroDao
import com.dimthomas.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.dimthomas.borutoapp.domain.model.Hero
import com.dimthomas.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}