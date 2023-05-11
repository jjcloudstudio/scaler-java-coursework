import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        System.out.print(n1%3==0 && n1%5==0 ? "FizzBuzz" : n1%3==0 ? "Fizz" : n1%5==0 ? "Buzz" : "Invalid");
    }
}