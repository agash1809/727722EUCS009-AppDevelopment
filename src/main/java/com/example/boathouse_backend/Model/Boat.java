package com.example.boathouse_backend.Model;
import com.example.boathouse_backend.Model.BoatOwner;
import com.example.boathouse_backend.Respository.BoatRepository;

import jakarta.persistence.CascadeType;

// import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Boat {

    @Id
    private int id;
    private String name;
    private String boatId;
    private String BoatOwner;
    private String Category;
    private int NoOfRooms;
    private int NoOfPeople;
    private String AvailableTime;

    // @OneToOne(cascade = CascadeType.ALL) 


    

    



 


    public Boat(BoatOwner ow) {
        // this.ow = ow;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBoatId() {
        return boatId;
    }
    public void setBoatId(String boatId) {
        this.boatId = boatId;
    }
    public String getBoatOwner() {
        return BoatOwner;
    }
    public void setBoatOwner(String boatOwner) {
        BoatOwner = boatOwner;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public int getNoOfRooms() {
        return NoOfRooms;
    }
    public void setNoOfRooms(int noOfRooms) {
        NoOfRooms = noOfRooms;
    }
    public int getNoOfPeople() {
        return NoOfPeople;
    }
    public void setNoOfPeople(int noOfPeople) {
        NoOfPeople = noOfPeople;
    }
  
    public String getAvailableTime() {
        return AvailableTime;
    }
    public void setAvailableTime(String availableTime) {
        AvailableTime = availableTime;
    }
  
    



    

    
}
