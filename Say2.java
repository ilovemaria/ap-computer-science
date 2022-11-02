import java.util.Scanner;
import java.util.*;

public class Say2{
    public static void main(String[] args ){
        int guess = 0; 
        System.out.println("please enter a numeber between 1 and 100: ");
        Scanner keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();

        //Math operation in Java 
        // + add, - subtract, * multiple, / divide
        // % mod: This will give you the remainder of the tow numberes being divided 
        // For example: 14 % 3 = 2 19 % 4 = 3, 22 %5 = 2

        //Conditional Opperations 
        // compares two variables to see if the meet the given criteria 
        // does __ condition __
        // == equal
        // i= does not equal 
        //<less >greater
        //<=less or equal >=greater or equal
        guess = guess*3-10;
        System.out.println(guess);
        System.out.println(guess + " The math wizzard has changed your number guess bozo");
        int newGuess = 0;
        while(newGuess != guess){
            if (newGuess > guess){
                System.out.println("Too much nerd try again");
                newGuess = keyboard.nextInt();


            }
            
            else if (newGuess < guess){
                System.out.println("too little your a butt ass");
                newGuess = keyboard.nextInt();

            

            }
            
            else {
                 System.out.println("you did it ");   

            }
            
            

        }
        

    } 
}