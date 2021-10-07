package com.example.myappreclycerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    private String tittle;
    private String genre;
    private String director;
    private double rating;
    private String descrption;
    private String releasedate;

    public Data(String tittle, String genre, String director, double rating, String descrption, String releasedate) {
        this.tittle = tittle;
        this.genre = genre;
        this.director = director;
        this.rating = rating;
        this.descrption = descrption;
        this.releasedate = releasedate;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tittle);
        dest.writeString(this.genre);
        dest.writeString(this.director);
        dest.writeDouble(this.rating);
        dest.writeString(this.descrption);
        dest.writeString(this.releasedate);
    }

    public void readFromParcel(Parcel source) {
        this.tittle = source.readString();
        this.genre = source.readString();
        this.director = source.readString();
        this.rating = source.readDouble();
        this.descrption = source.readString();
        this.releasedate = source.readString();
    }

    protected Data(Parcel in) {
        this.tittle = in.readString();
        this.genre = in.readString();
        this.director = in.readString();
        this.rating = in.readDouble();
        this.descrption = in.readString();
        this.releasedate = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}
