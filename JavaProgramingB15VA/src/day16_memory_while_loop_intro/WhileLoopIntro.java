package day16_memory_while_loop_intro;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num = 1;
 //       while(num <= 10){ <- INFINITE  LOOP
 //           System.out.println("Hello Word!");
 //       }

        while(num <= 10){
            System.out.println("Hello Word!");
            num++;

       }
   //create a variable steps and assign 1 to it.
   //write a while loop to repeat 100 times.
   //each time print "Taking a step 2"

        int steps = 1;
        while(steps <= 100){
        System.out.println("Taking a step " + steps);
         steps++;
        }
        System.out.println("steps = " + steps);
    }
}
