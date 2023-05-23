import java.lang.*;
import java.util.*;

public class Main {
        
    public class Solution {
        public int solve(int A) {
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int sum = 0;
            if(num%3 ==0 || num%5 ==0){
                sum += num;
            }
        System.out.print(sum);
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = 0;
        if(num%3 ==0 || num%5 ==0){
            sum += num;
        }
        System.out.println(sum);
    }
}