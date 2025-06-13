package application;

import entitities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("What is the name of the employee?");
        String nameEmployee = sc.nextLine();
        employee.setName(nameEmployee);
        System.out.println("------");

        System.out.print("Amount of days Worked: ");
        int dayNumber = sc.nextInt();
        employee.setDayNumberWorked(dayNumber);

        System.out.print("Value Day Worked in dollar: ");
        int valueDayWork = sc.nextInt();
        employee.setValueOftheDayWorked(valueDayWork);
        System.out.println("--------------");
        System.out.printf("SALARY U$ = %.2f%n", employee.salaryEmployee());


        sc.close();
    }
}
