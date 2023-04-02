package com.example.homeworkcollections;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@ResponseStatus
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping
    public String hello() {
        return "Hello";
    }
    @GetMapping(path = "/employee/add")
    @RequestScope
    public Employee addEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
       return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping(path = "/employee/remove")
    @RequestScope
    public Employee deleteEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return employeeService.deleteEmployee(firstName, lastName);
    }
    @GetMapping (path = "/employee/find")
    @RequestScope
    public Employee findEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.findEmployee(firstName, lastName);
    }
}
