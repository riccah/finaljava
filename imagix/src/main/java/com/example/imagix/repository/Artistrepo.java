package com.example.imagix.repository;

import com.example.imagix.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artistrepo extends JpaRepository <Artist, Integer> {
}
