package Office_Hours.Ptactice_07_01_2020;

import java.util.Scanner;
/*
1. Ask user to enter two words. Then add them together and print. But if the last letter of the first
 word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
 */
public class CombineTwoStrings {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next(); // ight
        //                           01234

        // OneTwo
        char ch1 = str1.charAt(str1.length() - 1); // last char from str1
        char ch2 = str2.charAt(0); //first char from str2

        if (ch1 == ch2) {
            System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
        } else {
            System.out.println(str1 + str2);
        }


    }

}








