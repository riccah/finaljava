package com.example.imagix.controller;

import com.example.imagix.entities.Image;
import com.example.imagix.repository.Imagerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Imagecontroller {

        @Autowired
        private Imagerepo imagerepository;

        @GetMapping("/Imaging")
        public String viewPatient(Model model){
            model.addAttribute("Images",imagerepository.findAll());
            return "imagelist";
        }

        @PostMapping("/addimage")
        public String addnewNurse(Model model, Image image){
            model.addAttribute("newImage", new Image());
            imagerepository.save(image);
            return "redirect:/Imaging";

        }

        @GetMapping("/" +
                "/{id}")
        public String deleteNurse(@PathVariable("id") Integer id){
            imagerepository.deleteById(id);
            return"redirect:/NurseList" ;

        }



        @GetMapping("/editNurse/{id}")

        public String editPatient(@PathVariable("id") Integer id, Model model){

            model.addAttribute("nurse", imagerepository.findById(id).get());
            model.addAttribute("NurseList" ,imagerepository.findAll());

            return "editNurse";


        }

    }

