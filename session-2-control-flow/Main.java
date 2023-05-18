import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static int maxOfTwo(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int theFirstNum = scn.nextInt();
            int secondNumber = scn.nextInt();

            System.out.println("Max of two numbers is: " + maxOfTwo(theFirstNum, secondNumber));
        }
    }
}
