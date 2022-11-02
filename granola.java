import java.util.Scanner;
import java.util.*;

public class granola{

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will calculate your AP comp Sci grade. It will also tell you your letter grade");

        System.out.println("Please enter your average grade for Key Concepts");
        int KeyConcepts = keyboard.nextInt();

        System.out.println("Please enter your average grade for Key Concepts");
        int projects = keyboard.nextInt();
        
        System.out.println("Please enter your average grade for Key Concepts");
        int quiz = keyboard.nextInt();

        System.out.println("Please enter your average grade for Key Concepts");
        int test = keyboard.nextInt();

        double deezgrades = KeyConcepts*0.4+projects*0.2+quiz*0.2+test*0.2;
        System.out.println("Your average grade is " + deezgrades);

        if (deezgrades > 90){
            System.out.println("A lmao");
            
        } else if (deezgrades > 80) {  
            System.out.println("be b");
        } else if (deezgrades > 70) {
        
       
        System.out.println("c");
        }else if (deezgrades > 60) {
        System.out.println("d");
        } else {
        System.out.println("FFF");}
    }        
}