package com.example.aluas.androidnewapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by aluas on 07.10.2017.
 */
@Dao
public interface NewsDao {

    @Query("SELECT * FROM news")
    List<News> getAll();

    @Insert
    void insert(News news);

    @Insert
    void insertList(List<News> news);

    @Delete
    void delete(News news);

    @Query("SELECT * FROM news")
    List<News> getAllNews();
}

