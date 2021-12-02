package com.company;

public class Employee {
    private static String name;
    private final String secondName;
    private final String thirdName;
    private int salary;
    private int department;
    private int id;


    public Employee(String name, String secondName, String thirdName, int salary, int department, int id) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.salary=salary;
        this.department= department;
        this.id=id;
    }

    public static String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setDepartment(int department) {
        this.department=department;
    }
}