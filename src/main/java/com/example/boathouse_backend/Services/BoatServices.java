package com.example.boathouse_backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boathouse_backend.Model.Boat;
import com.example.boathouse_backend.Respository.BoatRepository;

@Service
public class BoatServices {

    @Autowired BoatRepository repo;

    public String add(Boat details)
    {
        repo.save(details);
        return "Successfully added";
    }
    public String addListOfBoat(List<Boat> boats)
    {
        repo.saveAll(boats);
        return "Successfully added list of boats";
    }

    public Boat findbyId(int id)
    {
        return repo.findById(id);
    }


    
}
