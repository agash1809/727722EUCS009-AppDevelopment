package com.example.boathouse_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.boathouse_backend.Model.Boat;
import com.example.boathouse_backend.Services.BoatServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class controller {
    @Autowired  BoatServices ser;

    @PostMapping("/add")
    public String add(@RequestBody Boat boat) {
       
             return ser.add(boat);

        
    }
    @PostMapping("/addBoats")
    public String addBoa(@RequestBody List<Boat> boats) {
      
         return ser.addListOfBoat(boats);
    }

    @GetMapping("/getboat/{id}")
    public Boat getBoatDetails(@PathVariable int id)
    {

        return ser.findbyId(id);
    }
    
    

    
    
}
