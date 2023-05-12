import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int naturalNum = scn.nextInt();
        if(naturalNum == 0){
            System.exit(0);
        }
        // boolean naturalNumIsNegative = naturalNum < 0;

        // if(naturalNumIsNegative) {
        //     naturalNum = naturalNum * -1;
        // }
        
        // int reverse = 0;
        // for(int i=0; naturalNum!=0; i++) {
        //     reverse = reverse*10 + naturalNum%10;
        //     naturalNum = naturalNum/10;
        //     // System.out.println("Reverse Num" + reverse);
        //     // System.out.println("naturalNum" + naturalNum);
        // }
        // System.out.print(naturalNumIsNegative ? "-" : "");
        while(naturalNum != 0){
            System.out.println(naturalNum%10);
            naturalNum = naturalNum/10;
        }
        // System.out.println(reverse);
    }
}