package day10_switch_logical_operators;

public class LeasingOffice {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Apartments!");
        int numberOfBedrooms = 0;
        double startingPrice = 0.0;

        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio is selected");
                startingPrice = 1200.0;
                break;
            case 1:
                System.out.println("One Bedroom is selected");
                startingPrice = 1400.0;
                break;
            case 2:
                System.out.println("Two Bedroom is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("Three Bedroom is selected");
                startingPrice = 2550.0;
                break;
                default:
                System.out.println("No such bedroom is not available");
        }
                System.out.println("Starting price: $" + startingPrice);
                if (startingPrice > 1300.0){
                    System.out.println("Too expensive, bye. Let me go and code Java");
                }
    }
}
