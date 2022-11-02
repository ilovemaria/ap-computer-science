import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.*;

public class jojo {
    public static void main(String[] args) {
        Scanner bals = new Scanner(System.in);
        //This program will give you a series of questions thata wil allow you to choose your own adventure. Your adventure needs to have minimym of 4 choices per path, One of the 
        // Inputs needs to be an integer. You need while loop checks to make sure the user is inputing a valid choice
        //Pro tip
        //1 indentatio is going to be very important, make sure indents are correct 
        //2 Dont forget the ; at the end 
        

        System.out.println("*Vending machine noises* what type of snack do u want: type 1 for epic 2 for sus and 3 for cheetos");
        int choices1 = bals.nextInt();
            while (choices1 != 1 && choices1 != 2 && choices1 != 3) {
            System.out.println("try agian bozo");
            choices1 = bals.nextInt();
            }
            if (choices1 == 1){ 
                System.out.println("you choose E P I C snacks you get 1 nine pound block of cheese: press 1 to continue");
                int choice2 = bals.nextInt();

                    while (choice2 != 1) {
                    System.out.println("try agian bozo");
                    choice2 = bals.nextInt();
                    }

                if (choice2 ==1){
                    System.out.println("You recieved a block of cheese: what do you do 1 put it in your pocket, 2 throw it at scott Noflicg");
                    int choice3 = bals.nextInt();
                        while (choice3 != 1 && choice3 != 2) {
                        System.out.println("try agian bozo");
                        choice3 = bals.nextInt();
                        }

                        if (choice3 == 1){
                            System.out.println("You put the cheese in your poctet do you: 1 let it chill, 2 turn it into a sculpture");
                            int choice4 = bals.nextInt();

                                while (choice4 != 1 && choice4 != 2) {
                                System.out.println("try agian bozo");
                                choice4 = bals.nextInt();
                                }

                            if (choice4 == 1){
                                System.out.println("The cheese becomes a successful bussiness owner in your pocket and you get hella bands *RICH ENDING*");
                            }
                            else if (choice4 == 2){
                                System.out.println("The cheese turns into Supa Idol and give you twelve nickles *NICKLE ENDING*");
                            }
                        }
                        else if (choice3 == 2){
                            System.out.println("You throw the cheese at scott it hits him and bounces off: Do you 1 get gritty, 2 go to Hamburg");
                            int choice4 = bals.nextInt();

                                while (choice4 != 1 && choice4 != 2) {
                                System.out.println("try agian bozo");
                                choice4 = bals.nextInt();
                                }

                            if (choice4 == 1){
                                System.out.println("You get gritty but scott throws a ruler at you and you are in a coma for 40 years and 40 days but you turn into Derrick after *DERRICK ENDING*");
                            }
                            else if (choice4 == 2){
                                System.out.println("You go to Hamburg and eat fried chicken with horrible nachos with Angela Merkel *DEUTSCHLAND ENDING*");
                            }
                        }
                    }
            

                }
            if (choices1 == 2){
                System.out.println("You choose sus you get yellow grape do you: 1 get a yellow grape or 2 Oliver");
                int choice2 = bals.nextInt();

                    while (choice2 != 1 && choice2 != 2) {
                    System.out.println("try agian bozo");
                    choice2 = bals.nextInt();
                    }

                if (choice2 == 1){
                    System.out.println("the vending machine expodes you die *LMAO ur bad ENDING*");
                }
                else if (choice2 == 2){
                    System.out.println("Omg you have a yellow grape: do you 1 put it in the trash or 2 crush it with your phone");
                    int choice3 = bals.nextInt();

                        while (choice3 != 1 && choice3 != 2) {
                        System.out.println("try agian bozo");
                        choice3 = bals.nextInt();
                        }

                        if (choice3 == 1){
                            System.out.println("The grape is in the trash but it starts ticking do you: 1 come closer or 2 run away");
                            int choice4 = bals.nextInt();
                            if (choice4 == 1){

                                while (choice4 != 1 && choice4 != 2) {
                                System.out.println("try agian bozo");
                                choice4 = bals.nextInt();
                                }

                                System.out.println("A real estate agent comes out and tells you about free real estate *REAL ENDING*");
                            }
                            else if (choice4 == 2){
                                System.out.println("YOU A COWARD AND ARE SMITED BY GOD *L ENDING*");
                            }
                        }
                        else if (choice3 == 2){
                            System.out.println("You crush the grape with your phone and inside is a pill do you: 1 eat the pill or 2 lick the pill");
                            int choice4 = bals.nextInt();
                            if (choice4 == 1){

                                while (choice4 != 1 && choice4 != 2) {
                                System.out.println("try agian bozo");
                                choice4 = bals.nextInt();
                                }

                            System.out.println("You hear loud noises and then wake up but you have no nose and are bald*? ENDING*");
                            }
                            else if (choice4 ==2){
                            System.out.println("weird *... ending*");
                            }
                    }
                }
            }

            if (choices1 == 3){
                System.out.println("You choose cheetos you get some pills do you 1 look at the vending machine or do you 2 s u p a i d o l");
                int choice2 = bals.nextInt();
                    while (choice2 != 1 && choice2 != 2) {
                    System.out.println("try agian bozo");
                    choice2 = bals.nextInt();
                    }
                
                if (choice2 == 1){
                System.out.println("How shall you pay for the pills: 1 debt card, 2 credit card, 3 cash money");
                int choice3 = bals.nextInt();
                    while (choice3 != 1 && choice3 != 2 && choice3 != 3) {
                    System.out.println("try agian bozo");
                    choice3 = bals.nextInt();
                    }

                    
                    if (choice3 == 1){
                        System.out.println("You pay for the pills what do you do 1 eat them or 2 eat them");
                        int choice4 = bals.nextInt();

                            while (choice4 != 1 && choice4 != 2) {
                            System.out.println("try agian bozo");
                            choice4 = bals.nextInt();
                            }

                        if (choice4 == 1){
                            System.out.println("you turn into a gnome: do you 1 gnome people or 2 g n o m e o and j u l i e t");
                            int choice5 = bals.nextInt();
                            
                                while (choice5 != 1 && choice5 != 2) {
                                System.out.println("try agian bozo");
                                choice5 = bals.nextInt();
                                }

                            if (choice5 == 1){
                                System.out.println("you gnome the president and get arrested for treason and are hanged *OMEGALOL ENDING*");
                            
                        }
                        
                            else if (choice5 == 2){
                                System.out.println("Sherlock gnomes comes and then everthing goes black");
                            }
                    }
                    else if (choice2 == 2){
                    System.out.println("card declined");}
                    else if (choice2 == 3){
                    System.out.println("no cash says the vending machine");}
                }0
            }
            else if (choice2 == 2)
                System.out.println("Supa Idol comes from the sky and slaps you into the sun *BASED ENDING*");    
             

        }




    }
}
