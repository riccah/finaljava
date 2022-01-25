package com.example.imagix.controller;

import com.example.imagix.entities.Booking;
import com.example.imagix.repository.Artistrepo;
import com.example.imagix.repository.Bookingrepo;
import com.example.imagix.repository.Imagerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookingcontroller {

        @Autowired
        private Bookingrepo bookrepository;
        private Artistrepo artsticrepo;
        private Imagerepo nurserepo;

        @GetMapping("/Bookinglist")
        public String viewPatient(Model model){
            model.addAttribute("Boking", bookrepository.findAll());
            return "Booklist";


        }
        @PostMapping("/addPatient")
        public String addnewPatient(Model model, Booking patient){

            model.addAttribute("newPatient", new Booking());

            bookrepository.save(patient);
            return "redirect:/PatientList";
        }


        @GetMapping("/deletePatient/{id}")
        public String deletePatient(@PathVariable("id") Integer id){
            bookrepository.deleteById(id);
            return"redirect:/PatientList" ;

        }



        @GetMapping("/editPatient/{id}")

        public String editPatient(@PathVariable("id") Integer id, Model model){

            model.addAttribute("patient1", bookrepository.findById(id).get());
            model.addAttribute("PatientList1" ,bookrepository.findAll());


            return "editPatient";


        }


    }

