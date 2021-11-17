package com.company;

public class Employee {
    private final String name;
    private final String secondName;
    private final String thirdName;
    private int salary;
    private int[] department = new int[5];
    private int id;

    public Employee(String name, String secondName, String thirdName) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

}