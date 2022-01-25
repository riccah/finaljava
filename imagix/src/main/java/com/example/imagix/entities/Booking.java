package com.example.imagix.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer ClientId;
        @Column(nullable = false, length = 40)
        String CleintnameName;
        @ManyToOne
        @JoinColumn(name = "artwork_image_id")
        Image Artwork;
        @ManyToOne
        @JoinColumn(name = "artist_artist_id")
        Artist Artist;



    }
