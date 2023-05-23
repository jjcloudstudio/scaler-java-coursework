// R1C1R1C2R1C3R1C4R1C5R1C1R1C2R1C3R1C4R1C5
// R2C1R2C2R2C3R2C4--------R2C1R2C2R2C3R2C4
// R3C1R3C2R3C3----------------R3C1R3C2R3C3
// R4C1R4C2------------------------R4C1R4C2
// R5C1--------------------------------R5C1
// R1C1--------------------------------R1C1
// R2C1R2C2------------------------R2C1R2C2
// R3C1R3C2R3C3----------------R3C1R3C2R3C3
// R4C1R4C2R4C3R4C4--------R4C1R4C2R4C3R4C4
// R5C1R5C2R5C3R5C4R5C5R5C1R5C2R5C3R5C4R5C5

import java.lang.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i+1; j++) { // n+1 = m+i => n = m+i-1 or m = n-i+1 or i = n-m+1
                System.out.print("R" + i + "C" + j);
            }
            for(int j=1; j<=i-1; j++) {
                System.out.print("----");
            }

            for(int j=1; j<=i-1; j++) {
                System.out.print("----");
            }
            for(int j=1; j<=5-i+1; j++) { // n+1 = m+i => n = m+i-1 or m = n-i+1 or i = n-m+1
                System.out.print("R" + i + "C" + j);
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++) { // n+1 = m+i => n = m+i-1 or m = n-i+1
                System.out.print("R" + i + "C" + j);
            }
            for(int j=1; j<=5-i; j++) {
                System.out.print("----");
            }

            for(int j=1; j<=5-i; j++) {
                System.out.print("----");
            }
            for(int j=1; j<=i; j++) { // n+1 = m+i => n = m+i-1 or m = n-i+1
                System.out.print("R" + i + "C" + j);
            }
            

            System.out.println();
        }
    }
}

