import java.util.Scanner;

import java.util.*;

public class rock {
    public static void main(String[] args) {
        Scanner bals = new Scanner(System.in);
        int chicken = (int) (Math.random() * 3);

        System.out.println("Shall you choose rock paper or scizzor");
        String choice = bals.nextLine().toUpperCase();

        while (!(choice.equals("ROCK") || choice.equals("PAPER") || choice.equals("SCIZZOR"))) {
            System.out.println("ROCK PAPER SCIZZOR ONLY ");
            choice = bals.nextLine();    
        }
        
        if (choice.equals("ROCK") && chicken == 0) {
            System.out.println("DRAW U SUCK");
        } 
        else if (choice.equals("ROCK") && chicken == 1) {
            System.out.println("WEINER WINNER U WIN");
        } 
        else if (choice.equals("ROCK") && chicken == 2) {
            System.out.println("L U SUCK");
        } 
        else if (choice.equals("SCIZZOR") && chicken == 0) {
            System.out.println("DRAW U SUCK");
        } 
        else if (choice.equals("SCIZZOR") && chicken == 1) {
            System.out.println("WEINER WINNER U WIN");
        } 
        else if (choice.equals("SCIZZOR") && chicken == 2) {
            System.out.println("L U SUCK");
        } 
        else if (choice.equals("PAPER") && chicken == 0) {
            System.out.println("DRAW U SUCK");
        } 
        else if (choice.equals("PAPER") && chicken == 1) {
            System.out.println("WEINER WINNER U WIN");
        } 
        else if (choice.equals("PAPER") && chicken == 2) {
            System.out.println("L U SUCK");
        } 

    }

}