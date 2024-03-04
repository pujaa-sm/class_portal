package com.day1_cw4.day1_cw4.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.day1_cw4.day1_cw4.model.Address;

@RestController
public class AddressController {
    @RequestMapping("/address")
    public Address getAddress()
    {
        Address a=new Address("nidharshan",123,"Main St",658865,"pudur","salem","tamil nadu","india");
        return a;
    }
}