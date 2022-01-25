package com.example.imagix.repository;

import com.example.imagix.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookingrepo extends JpaRepository <Booking, Integer>
{

}
