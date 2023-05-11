import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int num4 = scn.nextInt();
        int num5 = scn.nextInt();

        int finalPercentage = (num1+ num2 + num3 + num4 + num5)/5;
        System.out.print(finalPercentage + "\n" + (finalPercentage >= 90 ? "A" : finalPercentage >= 80 ? "B" : 
        finalPercentage >= 70 ? "C" : finalPercentage >= 60 ? "D" : finalPercentage >= 40 ? "E" : "F"));
        
    }
}