package com.spring.database.springbootassignment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.database.springbootassignment.model.Employee;
import com.spring.database.springbootassignment.repository.EmployeeRepository;


@RestController
@RequestMapping(value ="spring/employees")
public class EmployeeServices {
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping(value ="/getAll")
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<>();
		
		return list;
	}
	
	@RequestMapping("/insert")
    public String process(){
        employeeRepository.save(new Employee("Sonali"));
        employeeRepository.save(new Employee("Johnson"));
        employeeRepository.save(new Employee("Smith"));
        return "Done";
    }
	
	@RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
          
        for(Employee emp : employeeRepository.findAll()){
            result += "<div>" + emp.toString() + "</div>";
        }
          
        return result + "</html>";
    }
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") int id){
		String result = "";
		result = employeeRepository.findById(id).toString();
		return result;
	}
	
	@RequestMapping("/count")
	public long count(){
		String result = "<html>";
		return (employeeRepository.count());
	}

}
