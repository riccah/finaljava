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

public class Artist {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer ArtistId;
        @Column(nullable = false, length = 40)
        String ArtistName;
    }


