package com.spring.database.springbootassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.database.springbootassignment.model.Address;




public interface AddressRepository extends JpaRepository<Address,Integer>{

}
