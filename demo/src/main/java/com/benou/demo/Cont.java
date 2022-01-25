package com.benou.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cont {

    @GetMapping
    public String home(Model trans)
    {
        List<Employee> Elist = new ArrayList<>();
        Elist.add(new Employee("12", "Karasira","Gasabo","93903","Database"));
        Elist.add(new Employee("23", "Kirikou","Huye","394940","Networking"));
        Elist.add(new Employee("48","Kirasa","Nyamagabe","93433","Linux"));

        trans.addAttribute("EmployeeList", Elist);
        return "index.html";
    }
}
