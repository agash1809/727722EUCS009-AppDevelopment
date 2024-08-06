package com.example.boathouse_backend.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boathouse_backend.Model.Boat;

public interface BoatRepository extends JpaRepository<Boat,Integer>{
    public Boat findById(int id);


}
