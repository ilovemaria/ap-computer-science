import java.util.Scanner;
import java.util.*;

public class zout{
    public static void main(String[] args ) {
        
        Scanner bals = new Scanner(System.in);
        System.out.println("I need a word. ");

        String parrot = bals.nextLine();
        System.out.println("Parrot says: "+parrot);
        while (!parrot.equalsIgnoreCase("q")) {
            System.out.println("Enter a word (q to quit): ");
            parrot = bals.nextLine();
            System.out.println("Parrot says: "+parrot);
            
        
         }
       
    }

}