package com.company;

public class Main {

    static int id=0;

    public static void main(String[] args) {
	// write your code here
        Employee[] employees = new Employee[10];
        createList(employees);
        checkNull(employees);
        sumSalary(employees);

       /* System.out.println("Максимальная зарплата " + maxSalary());
        System.out.println("Минимальная зарплата " + minSalary());
        System.out.println("Средняя зарплата " + midSalary());*/


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
        addEmployee(employees, new Employee("Ivan", "Ivanovich", "Ivanov", generateRandomSalary(), generateRandomDepartament()));
        addEmployee(employees, new Employee("Dmitry", "Dmitrievich", "Dmitryev", generateRandomSalary(),generateRandomDepartament()));
        addEmployee(employees, new Employee("Sidor", "Sidirovich", "Sidorin", generateRandomSalary(),generateRandomDepartament()));
        addEmployee(employees, new Employee("Egor", "Egorovich", "Egorov", generateRandomSalary(),generateRandomDepartament()));
        addEmployee(employees, new Employee("Klim", "Klimovich", "Klimov", generateRandomSalary(),generateRandomDepartament()));
        addEmployee(employees, new Employee("Karp", "Karpovich", "Karpov", generateRandomSalary(),generateRandomDepartament()));
        addEmployee(employees, new Employee("Sergey", "Sergeevich", "Sergeev", generateRandomSalary(),generateRandomDepartament()));

    }

    public static int generateRandomSalary() {
        java.util.Random random = new java.util.Random();
        int sal = random.nextInt(100_000) + 100_000;
        return sal;
    }

    public static int[] generateRandomDepartament() {
        java.util.Random random = new java.util.Random();
        int dep[] = new int[5];
        for(int i=0;i < dep.length;i++){
            dep[i]=random.nextInt(5);
        }
        return dep;
    }

    public static void printFullInfo(Employee empl) {

        System.out.println(String.join(": ",
                empl.getName() + " " + empl.getSecondName() + " " + empl.getThirdName(),
                String.valueOf(empl.getSalary() + " salary")
        ));
    }

    public static void checkNull(Employee[] emplo) {
        for (Employee emp : emplo) {
            if (emp != null) {
                printFullInfo(emp);
            }
        }
    }

    public static void sumSalary(Employee[] emplo) {

        int sum =0;
        sum+=emplo.getSalary();
        System.out.println("Сумма всех зарплат " + sum);
    }

    public static void maxSalary() {
        int max = 0;

    }

    public static void minSalary() {
        int min = 0;


    }

    public static void midSalary() {
        int sum=0;
        int j=0;


    }

    public static void printFIO(Employee[] emplo) {

    }
}



