import java.lang.*;
import java.util.*;

public class Main {

    static void printFactorial(int num_A) {
        int factorial = 1;
        if (num_A == 0) {
            System.out.println("1");
            return;
        }
        for (int i = 1; i <= num_A; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        int temp_num_A = num_A;

        printFactorial(num_A);

    }
}