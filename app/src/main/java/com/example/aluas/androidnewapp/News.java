package com.example.aluas.androidnewapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aluas on 07.10.2017.
 */
@Entity(tableName = "news")
public class News implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Integer id;

    @SerializedName("title")
    @ColumnInfo(name = "title")
    private String title;

    @SerializedName("body")
    @ColumnInfo(name = "body")
    private String body;

    @SerializedName("date")
    @ColumnInfo(name = "date")
    private String date;

    public News() { };

    @Ignore
    public News(String _title, String _body, String _date) {
        this.title = _title;
        this.body = _body;
        this.date = _date;
    }

    @Ignore
    protected News(Parcel in) {
        title = in.readString();
        body = in.readString();
        date = in.readString();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };

    public void setId(Integer id){this.id = id;}

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(body);
        parcel.writeString(date);
    }
}

