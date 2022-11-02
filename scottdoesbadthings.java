import java.util.Scanner;
import java.util.*;

public class scottdoesbadthings {
    public static void main(String[] args) {
        Scanner based = new Scanner(System.in);
        //in generl: a loop has 4 elements
        //1. Intitialzation expresion
        //2. A test expression
        //3. Update expression
        //4. Body of the loop 

        //Note before we begin
        //++ That means incriment up
        //-- That means incriment down

        //For Loops 
        //for(intialization expression ; test expression ; update expression){
            // body of the loop, tells the computer what to do with the variable if the test expressions is not met

        //}
        //the goal of today is for the computer to type: 123455555555678910987654321
        int x = 0;
        for(x=1; x <= 10; x++){
            System.out.print(x + " ");
        }
        for(x=10; x >= 1; x--){
            System.out.print(x + " ");
        }
    /*While loops
     * while(test expressions){
     *  loop body, tells the computer what to do if the test expressions is met
     * }
     * create a factorial function of a user input eg if they type 5 the output will be 5! 
     * =120
     */
    System.out.println("yo need a numbre ");
    int number = based.nextInt();
    int face = 1;
    while(number > 0 ){ 
        face = face*number ;
        number --; 
    }
    System.out.println("the factorial is "+ face );
    //while do loops 
    //do
    //{
        // statements;
    //} while (test expression);
    // the goal of today is for the computer to type  123455555555678910987654321
    int four = 1;
    do 
    {
        System.out.print(four+" ");
        four++;

    }while(four<=10);
    
    do 
    {
        System.out.print(four+" ");
        four--;

    }while(four>=1);

    }   
    
}   