import java.lang.*;
import java.util.*;

public class Main {

    static boolean isPerfectSquare(int N){
        int i = 1;
        while(i*i <= N){
            if(i*i == N){
                return true;
            }
            i++;
        }
        return false;
    }
    static int sumEven(int N){
        int sum = 0;
        for(int i = 2; i <= N; i=i+2){
            sum = sum + i;
        }
        return sum;
    }

    static int takeInput(){
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        return num_A;
    }
    public static void main(String[] args) {
        int num_A = takeInput();
        boolean finalAns = isPerfectSquare(num_A);
        System.out.println(finalAns);
    }
}