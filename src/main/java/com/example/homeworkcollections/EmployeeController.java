package com.example.homeworkcollections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping
    public String hello() {
        return "Hello";
    }
    @GetMapping(path = "/employee/add")
    public Employee addEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
       return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping(path = "/employee/remove")
    public Employee deleteEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return employeeService.deleteEmployee(firstName, lastName);
    }
    @GetMapping (path = "/employee/find")
    public Employee findEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.findEmployee(firstName, lastName);
    }
}
