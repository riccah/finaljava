package com.example.imagix.controller;

import com.example.imagix.entities.Artist;
import com.example.imagix.repository.Artistrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Artistcontroller {

        @Autowired
        private Artistrepo artrepository;

        @GetMapping("/artist")
        public String viewPatient(Model model){
            model.addAttribute("Artists", artrepository.findAll());
            return "Artistlist";
        }

        @PostMapping("/addartist")
        public String addnewDoctor(Artist artist, Model model){

            model.addAttribute("newartist", new Artist());
            artrepository.save(artist);
            return "redirect:/DoctorList";
        }

        @GetMapping("/deleteDoctor/{id}")
        public String deleteDoctor(@PathVariable("id") Integer id){
            artrepository.deleteById(id);
            return"redirect:/DoctorList" ;

        }


        @GetMapping("/editDoctor/{id}")

        public String editDoctor(@PathVariable("id") Integer id, Model model){

            model.addAttribute("doctor", artrepository.findById(id).get());
            model.addAttribute("DoctorList" ,artrepository.findAll());

            return "editDoctor";


        }

    }


