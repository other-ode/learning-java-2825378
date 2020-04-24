import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class Main {

    public static double calculateEmployeeSalary(double hours, double rate, double holiday){
        double grossSalary = ((52 * hours) - (holiday * 8)) * rate;
        return grossSalary;
    }

    public static void main(String[] args) {

        System.out.println("This is code calculate the employee annual salary based on 52 weeks in a year");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the hours worked per week.");
        double hoursPerWeek = input.nextDouble();
        while (hoursPerWeek <= 0) {
            System.out.println("That's invalid. Please input the hours worked per week.");
            hoursPerWeek = input.nextDouble();
        }

        System.out.println("Please input the hourly rate for employee.");
        double hourlyRate = input.nextDouble();
        while (hourlyRate <= 0) {
            System.out.println("That's invalid. Please input the hourly rate for employee.");
            hourlyRate = input.nextDouble();
        }

        System.out.println("Please input the total number of holiday for employee.");
        double holidayTaken = input.nextDouble();
        while (holidayTaken < 0) {
            System.out.println("That's invalid. Please input the total number of holiday for employee.");
            holidayTaken = input.nextDouble();
        }

        double salary = calculateEmployeeSalary(hoursPerWeek,hourlyRate,holidayTaken);
        System.out.println("The employee gross salary is " + salary);

    }
}