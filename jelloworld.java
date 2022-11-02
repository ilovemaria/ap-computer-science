import java.util.Scanner;
import java.util.*;


public class jelloworld{ 
    public static void main(String[] args) {    
        //System.out.println("This is an example of how to create a user input" );
        //System.out.println( "It will allow the user to type their answer and save ot as a string");

        System.out.print( "Please enter a word or phrase ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        //System.out.println("you said " + input);
            System.out.println("there are " + input.length() + " the characters in your word");
            System.out.println("the second to last letter is: " + input.charAt(input.length()-2));
            System.out.println("the last letter is: " + input.charAt(input.length()-1));
            
        // if statements Checks to see If an input matches the criteria. ELSE it does not The computer will chekc in this order: If ->else. You can have as many else ifs 
        //as you need. however there can only be one if and one else in your statement 
        
       /*  if (input.equals("apples")){
            System.out.println("yOu MUST BE A MONKEY");
        }

        else if (input.equals("oranges")){
                System.out.println("OMEGA LOL YOU GOT TO BE TROLLING");
        }

        else{
            System.out.println("fornite");
        }*/



     }          
}