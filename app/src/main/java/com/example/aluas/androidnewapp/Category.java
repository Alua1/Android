package com.example.aluas.androidnewapp;

/**
 * Created by aluas on 06.10.2017.
 */

public class Category {
    private String name;
    private int numOfNews;
    private int thumbnail;

    public Category(){}

    public Category(String _name, int _numOfNews, int _thumbnail) {
        this.name = _name;
        this.numOfNews = _numOfNews;
        this.thumbnail = _thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getNumOfNews() {
        return numOfNews;
    }

    public void setNumOfNews(int _numOfNews) {
        this.numOfNews = _numOfNews;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int _thumbnail) {
        this.thumbnail = _thumbnail;
    }
}

