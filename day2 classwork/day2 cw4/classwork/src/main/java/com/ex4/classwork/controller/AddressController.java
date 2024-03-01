package com.ex4.classwork.controller;


    

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springapp.model.Address;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address getMethodName() {
        Address address=new Address("ABC",123,"Main St", 030, "Kuniyamuthur", "Coimbatore", "TamilNadu", "India");
        return address;
    }
}

