// import java.lang.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int number = scn.nextInt();
//         int reverse = 0;

//         boolean numberIsNegative = number < 0;
//         if(numberIsNegative) {
//             number = -number;
//             // System.out.print("-");
//         }
//         else if(number == 0) {
//             System.out.println(0);
//             return;
//         }

//         for(int i=number; i!=0; i/=10) {
//             reverse = reverse*10 + i%10;
//         }
        
//         if(numberIsNegative) {
//             reverse = -reverse;
//         }
//         System.out.println(reverse);
//     }
// }