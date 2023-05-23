// 1
// 2
// 3
// 5
// 6
// 75
import java.lang.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        
        int sum = 0;

        for(int i=1; i<=5; i++){
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();

            sum = sum + num*num;
        }
        System.out.println(sum);

    }
}

