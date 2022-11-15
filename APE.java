import java.util.*;

public class APE{

    public static void main(String[] args ){
        Scanner bals = new Scanner(System.in);

        int x = 0; 
        int y = 0;

        System.out.println("This codde will make shapes sometimes");
        System.out.println("Do you want square, rectangle, right triangle, or isosceles triangle.");
        String ape = bals.nextLine().toLowerCase();
        System.out.println("SIZE?(WIDTH)");
        int width = bals.nextInt();
        System.out.println("SIZZLE Hite");
        int hite = bals.nextInt();
        if (ape.equals("square")){
            for (y=0; y<width;y++) {
                for (x=0;x<width;x++){
                    System.out.print("* ");
                }
                System.out.println("");
            }                 
        }
        if (ape.equals("rectangle")){
            for (y=0; y<hite;y++) {
                for (x=0;x<width;x++){
                    System.out.print("* ");
                }
                System.out.println("");
            }    
        }
        if (ape.equals("right triangle")){
            for (y=0; y<hite;y++) {
                for (x=0;x<=y;x++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
        if (ape.equals("i")){
            for (y=0; y<(hite + 1)/2 ;y++) {
                for (x=0;x<=y ;x++){
                    System.out.print("* ");
                }
                System.out.println("");
                
            }
            for (x=(hite)/2; x>0 ;x--) {
                for (y=0; y<x ;y++){
                    System.out.print("* ");
                }
                System.out.println("");
                
            }
        }
        




    }
}    