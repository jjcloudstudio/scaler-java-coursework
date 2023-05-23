import java.lang.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int counter = 1;

        for(int i=1; i<=num; i++){
            //task for i-th row
            for(int j=1; j<=num-i; j++){ // n+m = i+1 => m = i+1-n
                System.out.print("_");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j + "_");
            }
            System.out.println();
        }

    }
}

