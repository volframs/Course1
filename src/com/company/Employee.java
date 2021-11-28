package com.company;

public class Employee {
    private static String name;
    private final String secondName;
    private final String thirdName;
    private int salary;
    private int counter;
    private int[] department = new int[5];
    private int id;


    public Employee(String name, String secondName, String thirdName, int salary, int[] department) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.salary=salary;
        this.department= department;
        id=counter;
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

    public int[] getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setDepartment(int[] department) {
        this.department=department ;
    }
}