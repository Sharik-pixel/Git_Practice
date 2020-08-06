package day29_CustomMethods;


    /*
    1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
    */

public class Uniqie {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};

        for(String a : arr){ // gets each of the elements

            int count = 0;

            for ( String each : arr) { // ges the frequency of the element
                if( a.equals(each) ){
                    count++;
                }
            }

            if(count == 1){ // unigue
                System.out.print(a+ " ");
        }



        }
    }
}