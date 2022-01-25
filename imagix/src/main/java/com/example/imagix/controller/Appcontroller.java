package com.example.imagix.controller;

import com.example.imagix.entities.Booking;
import com.example.imagix.repository.Artistrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

    @Controller
    public class Appcontroller {

        @Autowired
        private Artistrepo Artifactrepo;
        public String showIndex(Model model){

            model.addAttribute("Patient", new Booking());
            model.addAttribute("DoctorList1", Artifactrepo.findAll());
            return "index";
        }

    }



