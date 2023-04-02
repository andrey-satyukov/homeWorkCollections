package com.example.homeworkcollections;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String notFind) {
        super(notFind);
    }
}
