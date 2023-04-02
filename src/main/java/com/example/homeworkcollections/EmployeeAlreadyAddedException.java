package com.example.homeworkcollections;

public class EmployeeAlreadyAddedException extends  RuntimeException{
    public EmployeeAlreadyAddedException(String massage) {
        super(massage);
    }
}
