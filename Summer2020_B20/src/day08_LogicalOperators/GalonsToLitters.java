package day08_LogicalOperators;
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */
public class GalonsToLitters {
    public static void main(String[] args) {

     double gallons = 20;
     double litters = gallons * 3.785;

        System.out.println(gallons +" gallons equal to " + litters+ " litters");





    }
}
