// import java.lang.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // YOUR CODE GOES HERE
//         // Please take input and print output to standard input/output (stdin/stdout)
//         // DO NOT USE ARGUMENTS FOR INPUTS
//         // E.g. 'Scanner' for input & 'System.out' for output
//         Scanner scn = new Scanner(System.in);
//         double inputValue = scn.nextDouble();

//         double first50 = 0.50;
//         double next100_first = 0.75;
//         double next100_second = 1.20;
//         double above250 = 1.50;
//         double surcharge = 0.20;

//         double finalBill = 0.0;
//         //221 

//         if(inputValue <= 50){
//             finalBill = inputValue * first50;
//         }else if(inputValue <= 150){
//             double tempValue = inputValue - 50;
//             finalBill = (50*0.5) + (tempValue*0.75);
//         }else if(inputValue <= 250){
//             double tempValue = inputValue - 50 - 100;
//             finalBill = (50*0.5) + (100*0.75) + (tempValue*1.20);
//         }else if(inputValue > 250){
//             double tempValue = inputValue - 50 - 100 - 100;
//             finalBill = (50*0.5) + (100*0.75) + (100*1.2) + (tempValue*1.50);
//         }

//         System.out.print((int)(finalBill + finalBill*surcharge));
//     }
// }
// //50*0.5 + 100*0.5 + 71*1.2 =  