package com.company;

public class Main {

    static int id=0;

    public static void main(String[] args) {
	// write your code here
        Employee[] employees = new Employee[10];
        createList(employees);
        checkNull(employees);
        System.out.println("Сумма всех зарплат " + sumSalary());
        System.out.println("Максимальная зарплата " + maxSalary());
        System.out.println("Минимальная зарплата " + minSalary());
        System.out.println("Средняя зарплата " + midSalary());


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
        addEmployee(employees, new Employee("Ivan", "Ivanovich", "Ivanov", generateRandomArray()));
        addEmployee(employees, new Employee("Dmitry", "Dmitrievich", "Dmitryev", generateRandomArray()));
        addEmployee(employees, new Employee("Sidor", "Sidirovich", "Sidorin", generateRandomArray()));
        addEmployee(employees, new Employee("Egor", "Egorovich", "Egorov", generateRandomArray()));
        addEmployee(employees, new Employee("Klim", "Klimovich", "Klimov", generateRandomArray()));
        addEmployee(employees, new Employee("Karp", "Karpovich", "Karpov", generateRandomArray()));
        addEmployee(employees, new Employee("Sergey", "Sergeevich", "Sergeev", generateRandomArray()));

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
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

    public static int sumSalary() {
        int sum=0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            sum += generateRandomArray();
        }
        return sum;
    }

    public static int maxSalary() {
        int max = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if(max>generateRandomArray()){
                max=generateRandomArray();
                return max;
            }
        }
        return max;
    }

    public static void minSalary() {
        int min = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if(min<generateRandomArray()){
                min=generateRandomArray();
                return min;
            }
        }
        return min;

    }

    public static void midSalary() {
        int sum=0;
        int j=0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            sum += generateRandomArray();
            j=i;
        }
        return sum/j;

    }

    public static void printFIO(Employee[] emplo) {

    }
}



