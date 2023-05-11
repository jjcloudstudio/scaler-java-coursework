// import java.lang.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // YOUR CODE GOES HERE
//         // Please take input and print output to standard input/output (stdin/stdout)
//         // DO NOT USE ARGUMENTS FOR INPUTS
//         // E.g. 'Scanner' for input & 'System.out' for output
//         Scanner scn = new Scanner(System.in);
//         int bankBalance = scn.nextInt();
//         int typeOfOperation = scn.nextInt();
//         int amountToWorkWith = scn.nextInt();

//         if (typeOfOperation == 1) {
//             bankBalance += amountToWorkWith;
//         } else if (typeOfOperation == 2) {
//             if (bankBalance >= amountToWorkWith) {
//                 bankBalance -= amountToWorkWith;
//             } else {
//                 System.out.println("Insufficient Funds");
//             }
//         } else {
//             System.out.println("Invalid Input");
//         }
//         System.out.println(bankBalance);
//     }
// }
