import java.lang.*;
import java.util.*;

public class Main {

    static void printPattern(int num_A) {
        for (int i = 1; i <= num_A; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //print spaces in between
            if (i != num_A) {
                for (int j = 1; j <= num_A - i; j++) {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        int temp_num_A = num_A;

        printPattern(num_A);

        // for(int i = num_A; i >= 1; i--){
        // for(int j = 1; j <= i; j++){
        // System.out.print("*");
        // }
        // if(num_A == temp_num_A){
        // for(int j = 1; j <= temp_num_A; j++){
        // System.out.print("*");
        // }
        // temp_num_A--;
        // }
        // else{
        // for(int j = 1; j <= temp_num_A; j++){
        // System.out.print(" ");
        // }
        // temp_num_A--;
        // }
        // System.out.println();
        // }
    }
}