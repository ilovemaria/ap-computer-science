import java.util.Scanner;
import java.util.*;

public class TEXTPARSINPING{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a long word or phrase");
        String phrase = keyboard.nextLine();
        System.out.println(phrase);

        //This program will teach you how to parse words. it will show you how to use many function that will pertain to strings. We will take our phrase and edit it many times

        //.length(); This will return the number of character in your word or phrase 
        System.out.println("Your word/phrase a has" + phrase.length() + " characters");
        //.charAT(index): this will return the character at the desired index
        // the index of a string starts at 0 and increases bintil the end of the string 
        System.out.println("The third letter of your phrase is " + phrase.charAt(2));

        //.toUpperCase() This will make your phrase all upper case
        System.out.println("cap this jon " +phrase.toUpperCase());

        //.toLowerCase() THis will make your phrase all lower case
        System.out.println("lower this jon " +phrase.toLowerCase());

        // boolean is a variable that will return one of two thing true or flase
        boolean hasThe = phrase.contains("the");

        System.out.println("does the phrase contain \' the \'" + hasThe);

        //.substring(first, last) This will reture a new string that is piece of the original string. Starting at the first desired indec and ending at the laset desired index Note make sure that your string has enough characer in its index. for example if you typed "cat" and you want the first five letters it will return an error
        System.out.println(" your phrase includes the following letters" + phrase.substring(3, 15));
        int length = phrase.length();
        int halfway = length/2;
        int third = length/3;
        int twothirds = length*2/3;

        System.out.println(word + " is " + length + " characters long");
        System.out.println("the middle letter is " + phrase.substring(0, halfway));
        System.out.println("the first third of the letter is " + third);
        System.out.println("the second third of the letter is " + twothirds);
        System.out.println("the last third of letter is "+ );
        //.IndexOf() returns the first index fo the disired character
        System.out.println("The first /'a/' is at index ");
    }        
}