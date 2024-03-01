package com.ex1.classwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.ex1.classwork.model.Door;
import com.ex1.classwork.service.DoorService;

import jakarta.persistence.Id;

@RestController
public class DoorController {
    @Autowired
    private DoorService ser;

    @PostMapping("/api/customer")
    public ResponseEntity<Door> post(@RequestBody Door customer) {
        if (ser.post(customer)) {
            return new ResponseEntity<>(customer, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/customer/bycity/{city}")
    public ResponseEntity<List<Door>> getAllbyFiltering(@RequestParam("door") String city) {
        List<Door> li = ser.getAllDoorbyId(id);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/customer")
    public ResponseEntity<List<Door>> getAllDoors() {
        List<Door> li = ser.getAllDoors();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/customer/{customerId}")
    public ResponseEntity<Door> getAllCustomerByCustomerId(@PathVariable("doorId") int doorId) {
        Door li = ser.getAllDoor(door);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

    @PutMapping("/api/customer/{customerId}/{pincode}")
    public ResponseEntity<Door> updaCustomerByPincode(@PathVariable("customerId") int customerId,@PathVariable("pincode") int pincode) {
        Door li = ser.updateDoorId(doorId,Id);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/api/customer/{customerId}")
    public ResponseEntity<String> updaCustomerByPincode(@PathVariable("customerId") int customerId) {
        
        Door li = ser.getAllCustomerById(customerId);
        if (li!=null) {
            ser.deleteByCustomerID(customerId);
            return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

   

    
}
