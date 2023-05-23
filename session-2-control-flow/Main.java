// Importing necessary packages
import java.lang.*;
import java.util.*;

// Defining a public class named Main
public class Main {

    // Defining a static method named countOfPrime that takes an integer A as input and returns an integer value.
    static int countOfPrime (int A) {
        // Initializing a variable called count with 0.
        int count = 0;
        
        // Looping through all numbers from 1 to A.
        for (int i = 1; i <= A; i++) {
            // Initializing a variable called countDivisor with 0.
            int countDivisor = 0;
            
            // Looping through all numbers from 1 to i and counting how many divisors does each number have.
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {   // If 'j' is divisor of 'i'
                    countDivisor++;     // Increment the counter by one
                }
            }
            
            /* 
             * If there are exactly two divisors of 'i', then increment 
             * the prime counter ('count') by one. Because, any number which has only two divisors,
             * must be divisible by only itself and one, hence it is considered as prime number.  
             */
             
            if (countDivisor == 2) {    
                count++;
            }
        }
        
        return count;   // Return total number of primes found between [1,A]
    }


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);     
        
         /*
          * Reading three integers num_A,num_B,num_C from standard input using Scanner class.
          * However, only num_A is used in this program to count the number of prime numbers between [1,num_A]
          */
        int num_A = scn.nextInt();
        int num_B = scn.nextInt();
        int num_C = scn.nextInt();

        // Calling 'countOfPrime' method with input parameter as 'num_A'
        System.out.println(countOfPrime(num_A));

    }
}