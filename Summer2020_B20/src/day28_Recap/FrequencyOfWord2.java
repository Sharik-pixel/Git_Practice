package day28_Recap;



import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //(0,3)
        String word = scan.next();
        int l = word.length();

        int count = 0; // "cat
        for(int i = 0; i <= str.length()-word.length()-l; i++){
            if( str.substring(i,i+l).equalsIgnoreCase(word) ){
                count++;

            }
        }

        System.out.println(count);



    }
}
