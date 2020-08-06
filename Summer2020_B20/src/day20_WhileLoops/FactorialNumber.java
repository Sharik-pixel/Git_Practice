package day20_WhileLoops;
/*
 4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120

 */
import java.util.Scanner;

public class FactorialNumber {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int result = 1; // 5 * 4 * 3 * 2 * 1 == 120

        for(int i = scan.nextInt(); i >= 1; i-=1 ){ // i: 5, 4, 3, 2, 1
            result *= i;
        }

        System.out.println(result);


        }






    }

