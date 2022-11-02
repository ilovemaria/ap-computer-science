import java.util.Scanner;
import java.util.*;

public class lorr {
    public static void main(String[] args ) {
        Scanner bals = new Scanner(System.in)
        // 0 is the left hand
        // 1 is right hand 
        int hand = (int)(Math.random()*2);
        // set our guess to something that is not left or right 
        int guess =-2;

        // add in our while checker 
        while (guess != hand){
            System.out.println("Which had am i holding the candy in left or right");
            String input = keybourd.nextLine();
            if (input.equals("left")){
                guess = 0;
            }
            else if (input.equals("right")){
                guess = 1;

            }
            else {
                System.out.println("please type left or right");

            }
        }
        System.out.println("cool dog brotha ");
    } 
}