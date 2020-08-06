package day14_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println( email.contains("@")); // true
        System.out.println( email.contains("#")); //false
        System.out.println( email.contains("gmail")); //true
        System.out.println( email.contains("stunt")); //false

        //see if ".com is in the email, and store result into variable
        //hasDotCom. then print out
        boolean hasDotCom=email.contains(".com");
        System.out.println("hasDotCom = " + hasDotCom);

        String list = "milk, eggs, bread, water, chocolate, Turkey, potato, apples";

        //using if statement check if "turkey is in the list
        // if yes -> "Turkey is there!" -> "We forgot turkey"
        if(list.contains("Turkey")){
            System.out.println("Turkey in there in list!");
        }else{
            System.out.println("We forgot turkey");
        }
        if(list.contains("banana")){
        System.out.println("Bananas are in the list");
         }else {
            System.out.println("Lets add Bananas!");

        }

         //check if list contains "Milk" and store result into hasMilk variable
         //hasMilk
        boolean hasMilk = list.contains("milk");
        System.out.println("hasMilk = " + hasMilk);
        if(hasMilk){
            System.out.println("We got the milk");
        }
        //Look for "Water"
        boolean hasWater = list.toUpperCase().contains("WATER");
        System.out.println("hasWater = " + hasWater);


    }
}
