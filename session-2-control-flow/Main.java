import java.lang.*;
import java.util.*;

public class Main {

    static int powerFunction (int A, int B) {
        
        // int powerFunAns = 1;

        int finalPowerVal = 1;
        for(int i=1; i<=B; i++) {
            finalPowerVal = finalPowerVal*A;
        }

        return finalPowerVal;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        int num_B = scn.nextInt();

        System.out.println(powerFunction(num_A, num_B));

    }
}