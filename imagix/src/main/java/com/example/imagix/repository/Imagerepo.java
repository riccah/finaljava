package com.example.imagix.repository;

import com.example.imagix.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Imagerepo extends JpaRepository <Image, Integer> {
}
