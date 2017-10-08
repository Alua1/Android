package com.example.aluas.androidnewapp;

/**
 * Created by aluas on 06.10.2017.
 */

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {News.class}, version = 1)
public abstract  class AppDatabase extends RoomDatabase{
    public abstract NewsDao newsDao();
}
