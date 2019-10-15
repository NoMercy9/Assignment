package com.spring.database.springbootassignment.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.database.springbootassignment.model.Address;
import com.spring.database.springbootassignment.repository.AddressRepository;

@RestController
@RequestMapping(value ="spring/address")
public class AddressServices {
	@Autowired
	AddressRepository addressRepository;
	
	@RequestMapping("/insert")
    public String process(){
        addressRepository.save(new Address("New Zealand","city","110015"));
        addressRepository.save(new Address("India","city","110001"));
        addressRepository.save(new Address("Australia","city","110045"));
	addressRepository.save(new Address("England","city","110045"));
        return "Done";
    }
	
	@RequestMapping("/findallbypincode")
    public String findAll(){
        String result = "<html>";
          
        for(Address addrs : addressRepository.findAll()){
            result += "<div>" + addrs.toString() + "</div>";
        }
          
        return result + "</html>";
    }
	
}
