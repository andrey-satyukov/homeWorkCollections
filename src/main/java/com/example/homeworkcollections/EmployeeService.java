package com.example.homeworkcollections;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
//    public static int countEmployee = 0;

    //    public Employee[] employees = {
//            new Employee("", ""),
//            new Employee("", ""),
//            new Employee("", "")
//    };
    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(String firstName, String secondName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException {
        if (employees.size() > 100) {
            throw new EmployeeStorageIsFullException("Массив перепонен");
        }
        Employee currentEmployee = new Employee(firstName, secondName);
        if (employees.contains(currentEmployee)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в массиве.");
        }
        employees.add(currentEmployee);
        return employees.get(employees.size() - 1);
//        boolean flag = false;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].equals(currentEmployee)) {
//                throw new EmployeeAlreadyAddedException("Сотрудник уже есть в массиве.");
//            }
//        }
//        employees[countEmployee] = new Employee(firstName, secondName);
//        return employees[countEmployee++].toString();
    }
//        boolean flag = false;
        public  Employee deleteEmployee(String firstName, String secondName) throws EmployeeNotFoundException {
            Employee currentEmployee = new Employee(firstName, secondName);
            if (!employees.contains(currentEmployee)) {
                throw new EmployeeNotFoundException("Сотрудник не найден");
            }
            employees.remove((Employee) currentEmployee);
            return currentEmployee;
        }
        public  Employee findEmployee(String firstName, String secondName) throws EmployeeNotFoundException{
            Employee currwntEmployee = new Employee(firstName, secondName);
            if (employees.contains(currwntEmployee)) {
                return currwntEmployee;
            } else {
                throw new EmployeeNotFoundException("Сотрудник не найден");
            }
        }

}


//    public  String deleteEmployee(String firstName, String secondName) {
//        Employee currentEmployee = new Employee(firstName, secondName);
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].equals(currentEmployee)) {
//                employees[i] = null;
//                countEmployee--;
//                flag = true;
//            }
//        }
//        if (flag == false) {
//            return "Сотрудник не найден";
//        } else {
//            return currentEmployee.toString();
//        }
//    }
//    public  String findEmployee(String firstName, String secondName) throws EmployeeNotFoundException {
//        boolean flag = false;
//        Employee currentEmployee = new Employee(firstName, secondName);
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].equals(currentEmployee)) {
//                flag = true;
//            }
//        }
//        if (flag == false) {
//            throw new EmployeeNotFoundException("Сотрудник не найден");
//        } else {
//            return "Сотрудник " + firstName + " " + secondName + " найден.";
//        }
//    }

