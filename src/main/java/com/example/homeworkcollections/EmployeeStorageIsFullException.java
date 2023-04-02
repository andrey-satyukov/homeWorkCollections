package com.example.homeworkcollections;

public class EmployeeStorageIsFullException extends  RuntimeException{
    public EmployeeStorageIsFullException(String fullArray) {
        super(fullArray);
    }
}
