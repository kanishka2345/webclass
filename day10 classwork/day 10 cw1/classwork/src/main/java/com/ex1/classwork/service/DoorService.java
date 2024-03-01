package com.ex1.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex1.classwork.model.Door;
import com.ex1.classwork.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    private DoorRepo rep;

    public boolean post(Door door) {
        try {
            rep.save(door);
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
            return false;
        }
    }

    public List<Door> getAllDoorsByColor(String city) {
        return rep.findByColor(city);
    }

    public List<Door> getAllDoors() {
        return rep.findAll();
    }

    public Door getDoorById(int id) {
        return rep.findById(id).orElse(null);
    }

    public Door updateDoorPincode(int doorId, int pinCode) {
        Door door = rep.findById(doorId).orElse(null);
        if (door != null) {
            door.setPinCode(pinCode);
            rep.save(door);
        }
        return door;
    }

    public void deleteDoorById(int doorId) {
        rep.deleteById(doorId);
    }
}
