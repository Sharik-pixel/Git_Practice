package day10_switch_logical_operators;

public class GradeChecker {
    public static void main(String[] args) {
        char grade = 'W';

        switch(grade){
            case 'A'://if(grade) == 'A'{}
                System.out.println("Excellent");
                break;//exit switch statement
            case 'B':
                System.out.println("Good");
            break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Unknown grade-"+grade);
                break;
        }
        System.out.println(" ####  End of grade Checker programm ##");
    }
}
