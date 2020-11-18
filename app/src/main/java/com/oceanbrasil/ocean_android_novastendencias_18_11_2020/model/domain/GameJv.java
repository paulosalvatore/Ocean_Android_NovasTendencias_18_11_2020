package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.model.domain;

import android.os.Build;

import androidx.annotation.RequiresApi;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GameJv {

    // Properties

    @NotNull
    private final String name;

    @NotNull
    private final Integer launchYear;

    @NotNull
    private final String imageUrl;

    // Constructor

    public GameJv(String name, Integer launchYear, String imageUrl) {
        this.name = name;
        this.launchYear = launchYear;
        this.imageUrl = imageUrl;
    }

    public GameJv(String name, Integer launchYear) {
        this.name = name;
        this.launchYear = launchYear;
        this.imageUrl = "IMAGEM_DEFAULT";
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // Equals and HashCode

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameJv gameJv = (GameJv) o;
        return Objects.equals(getName(), gameJv.getName()) &&
                Objects.equals(getLaunchYear(), gameJv.getLaunchYear()) &&
                Objects.equals(getImageUrl(), gameJv.getImageUrl());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLaunchYear(), getImageUrl());
    }

    // To String

    @Override
    public String toString() {
        return "GameJv{" +
                "name='" + name + '\'' +
                ", launchYear=" + launchYear +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
