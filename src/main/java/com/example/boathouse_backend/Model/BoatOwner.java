package com.example.boathouse_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class BoatOwner {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ownerid;
    private String name;
    

   

  



    public int getOwnerid() {
        return ownerid;
    }
    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 

    
    
}
