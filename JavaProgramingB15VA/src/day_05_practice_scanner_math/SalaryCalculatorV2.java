package day_05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args){
          Scanner input = new Scanner (System.in);
          System.out.println("Enter hourly rate");
          double hourlyRate = input.nextDouble();
          double weeklySalary = hourlyRate * 40;
          double mounthlySalary = weeklySalary * 52 / 12;
          double annualSalary = mounthlySalary * 12;

          System.out.println("Your Weekly salary:" + weeklySalary);
          System.out.println("Your mounthly salary: " + mounthlySalary);
          System.out.println("Your annual salary: " + annualSalary);



    }
}
