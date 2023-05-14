import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input_number = scn.nextInt();
        int count = 0;
        if(input_number <=0){
            System.out.println("Invalid Input");
        }
        for(int i = 1; i <= input_number; i++){
            if(input_number % i == 0){
                count ++;
            }
            if(count == 2){
                System.out.println("YES");
                break;
            }
            else if(count > 2){
                System.out.println("NO");
                break;
            }
            //System.out.println("Hello World");
        }
        
    }
}