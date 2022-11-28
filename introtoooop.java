import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

class Computer{
    private String processor;
    private int memory;
    private int storage;

    public Computer(String proc, int mem,  int stor){
        processor = proc;
        memory = mem;
        storage = stor;
    }

    public String toString(){

        return processor + ", " + memory + "GB memory, " +storage +  "ZB storage.";
    }
}

class Lasagna{
    String removeLastCharacters(String word) {
        return word.substring(0, word.length() -1);
    }
    
}

public class introtoooop {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.removeLastCharacters("word");
        System.out.println(lasagna.removeLastCharacters("word"));
    }

}