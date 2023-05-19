//LCM of two numbers

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        int num_B = scn.nextInt();

        int HCF = 1;
        int LCM = 1;

        int min_number = Math.min(num_A, num_B); 
        
        for(int i=1; i<=min_number; i++){
            if(num_A%i==0 && num_B%i==0){
                HCF = i;
            }
        }

        LCM = (num_A*num_B)/HCF;
        System.out.println(LCM);
    }
}
