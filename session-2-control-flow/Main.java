//____1_
// ___1_2_
// __1_2_3_
// _1_2_3_4_
// 1_2_3_4_5_

import java.lang.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int counter = 1;

        for(int i=1; i<=num; i++){
            //task for i-th row
            for(int j=1; j<=num-i; j++){ // i + spaces = num => spaces = num-i 
                System.out.print("_");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j + "_");
            }
            System.out.println();
        }

    }
}

