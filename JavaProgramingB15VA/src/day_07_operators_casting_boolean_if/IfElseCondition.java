package day_07_operators_casting_boolean_if;

public class IfElseCondition {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Contition is true");
        } else {
            System.out.println("Condition is false");
        }

        int count = 25;
        if (count > 30) {
            System.out.println("Count is more then 30");
        }else{
            System.out.println("Count is less then 30");
        }

        int age = 35;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote");
        }
    }
}
