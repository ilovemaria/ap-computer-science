import java.util.Scanner;
import java.lang.Math;

class Functions
{
    String removeLastCharacters(String first, String last) {
        return first.substring(0, 1) + last.substring(0, 1);



    }
}

class powerthing
{
    private int x;

    public powerthing(int variable)
    {
    
        x= variable;
    }
    public int toIngeter()
    {
        return 3*5+x;
    }
}

public class Function 
{
    public static void main(String[] args) {
        Functions functions = new Functions();
        
        System.out.println(functions.removeLastCharacters("Jack", "Hu"));

        powerthing math = new powerthing(3);
        System.out.println(math.toIngeter());;
        
    }
}