import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt();
        int secondNumber = scn.nextInt();
        int thirdNumber = scn.nextInt();
        int fourthNumber = scn.nextInt();

        for(int i = firstNumber; i <= secondNumber; i++) {
            if(i == thirdNumber || i == fourthNumber) {
                continue;
            }
            else{
                System.out.print(i + " ");
            }
        }
        
    }
}