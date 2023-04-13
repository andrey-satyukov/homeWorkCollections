package com.example.homeworkcollections;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private  final Map<String, Employee> employees;

    public EmployeeService() {
        this.employees = new HashMap<>();
    }

    public Employee addEmployee(String firstName, String secondName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException {
        if (employees.size() > 100) {
            throw new EmployeeStorageIsFullException("Массив перепонен");
        }
        Employee currentEmployee = new Employee(firstName, secondName);
        if (employees.containsKey(currentEmployee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в массиве.");
        }
        employees.put(currentEmployee.getFullName(), currentEmployee);
        return employees.get(employees.size() - 1);

    }

        public  Employee deleteEmployee(String firstName, String secondName) throws EmployeeNotFoundException {
            Employee currentEmployee = new Employee(firstName, secondName);
            if (!employees.containsKey(currentEmployee.getFullName())) {
                throw new EmployeeNotFoundException("Сотрудник не найден");
            }
            employees.remove(currentEmployee.getFullName());
            return currentEmployee;
        }
        public  Employee findEmployee(String firstName, String secondName) throws EmployeeNotFoundException{
            Employee currwntEmployee = new Employee(firstName, secondName);
            if (employees.containsKey(currwntEmployee.getFullName())) {
                return employees.get(currwntEmployee.getFullName());
            } else {
                throw new EmployeeNotFoundException("Сотрудник не найден");
            }
        }

}



