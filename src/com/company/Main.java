package com.company;

public class Main {

    static int id=0;

    public static void main(String[] args) {
	// write your code here
        Employee[] employees = new Employee[10];
        createList(employees);
        printFullInfo(employees);
        System.out.println(id);//самопроверка
        //System.out.println("Employee.getName() = " + Employee.getName());
    }

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;

    }

    public static void createList(Employee[] employees){
        addEmployee(employees, new Employee("Ivan", "Ivanovich", "Ivanov", generateRandomSalary(), generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Dmitry", "Dmitrievich", "Dmitryev", generateRandomSalary(),generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Sidor", "Sidirovich", "Sidorin", generateRandomSalary(),generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Egor", "Egorovich", "Egorov", generateRandomSalary(),generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Klim", "Klimovich", "Klimov", generateRandomSalary(),generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Karp", "Karpovich", "Karpov", generateRandomSalary(),generateRandomDepartament(),generateID()));
        addEmployee(employees, new Employee("Sergey", "Sergeevich", "Sergeev", generateRandomSalary(),generateRandomDepartament(),generateID()));

    }

    public static int generateRandomSalary() {
        java.util.Random random = new java.util.Random();
        int sal = random.nextInt(100_000) + 100_000;
        return sal;
    }


    public static int generateID() {
        int tempID = id;
        tempID+=1;
        id = tempID;
        return id;
    }

    public static int generateRandomDepartament() {
        java.util.Random random = new java.util.Random();
        int dep = 5;
        for(int i=0;i < dep;i++){
            dep=random.nextInt(5)+1;
        }
        return dep;
    }

    public static void printFullInfo(Employee employ) {

        System.out.println(String.join(": ",
                employ.getName() + " " + employ.getSecondName() + " " + employ.getThirdName(),
                String.valueOf(employ.getSalary() + " salary"),
                employ.getDepartment() + " department's number",
                employ.getId() + " number of id"
        ));
    }

    public static void printFullInfo(Employee[] employ) {
        int sum =0;
        int max =0;
        int min =0;
        int com =0;
        for (Employee emp : employ) {
            if (emp != null) {
                min =emp.getSalary();
                sum+=emp.getSalary();
                printFullInfo(emp);
                max = maxSalary(max, emp.getSalary());
                min = minSalary(min, emp.getSalary());
                com++;

            }

        }
        sumSalary(sum);
        System.out.println("Максимальная зарплата " + max);
        System.out.println("Минимальная зарплата " + min);
        System.out.println("Средняя зарплата " + midSalary(sum,com));

    }

    public static void sumSalary(int sum) {
        System.out.println("Сумма всех зарплат " + sum);
    }

    public static int maxSalary(int max, int sal) {
        return Math.max(max, sal);
    }

    public static int minSalary(int min, int sal) {
        return Math.min(sal, min);
    }

    public static int midSalary(int sum, int com) {
        return sum/com;
    }

}




