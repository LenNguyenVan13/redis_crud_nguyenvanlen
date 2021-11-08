package com.example.redis_crud_nguyenvanlen.controller;


import com.example.redis_crud_nguyenvanlen.model.Employee;
import com.example.redis_crud_nguyenvanlen.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeRepository.saveEmployee(employee);
        return employee;
    }
//
    @GetMapping("/employees")
    public Long findAll(){

        return employeeRepository.findAll();
    }
//    @GetMapping("/employees/{id}")
//    public Employee findById(@PathVariable("id") Integer id){
//
//        return employeeRepository.findById(id);
//    }

    @PutMapping("/employee}")
    public void update(@RequestBody Employee employee){

        employeeRepository.update(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Integer id){
        employeeRepository.delete(id);
    }

}
