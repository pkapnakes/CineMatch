package com.cinematch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private double rating;

    private String posterUrl; // 👈 ΝΕΟ POSTER URL

    public Movie() {}

    public Movie(Long id, String title, String description, double rating, String posterUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.posterUrl = posterUrl;
    }
}
