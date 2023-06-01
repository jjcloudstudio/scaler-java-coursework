// Importing the java.util package which contains Scanner class
import java.util.*;

// Defining a public class named Main
public class Main {    
    
    // Defining a static method takeArraySize which takes an object of Scanner as input and returns an integer value.
    static int takeArraySize(Scanner sc){
        // Reading an integer from standard input using Scanner object and storing it in total_cases variable.
        int total_cases = sc.nextInt();
        return total_cases; // Returning the read integer value.
    }

    // Defining another static method takeArray which takes two inputs - an object of Scanner and an integer value, 
    // and returns an array of integers.
    static int[] takeArray(Scanner sc, int total_cases){
        // Creating a new array of integers with size equal to the given 'total_cases' parameter.
        int[] arr = new int[total_cases];
        
        for(int i=0; i<total_cases; i++){
            arr[i] = sc.nextInt();  // Reading integers from standard input using Scanner object and storing them in array elements one by one.
        }
        
        return arr;  // Returning the created array containing all read integers.
    }

      // Defining another static method getNegativeNum which takes an array of integers as input,
      // counts negative numbers present in it, prints them on console output stream,
      // but always returns zero (0).
      
    static int getNegativeNum(int[] A){
          int count = 0;
      
          for(int i=0; i<A.length; i++){
              if(A[i]<0){  
                  System.out.print(A[i]);  // Printing negative number found at index 'i' on console output stream without any newline character. 
            }
        }
      
          return 0; // Always returning zero (0) from this method.
    }
    
      // Defining the main method which is the entry point of our program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating a new object of Scanner class to read input from standard input stream.
        
        int total_cases = takeArraySize(sc);  // Calling takeArraySize method with scanner object as parameter and storing its returned value in 'total_cases' variable.

        int[] arr = takeArray(sc, total_cases);  // Calling takeArray method with scanner object and 'total_cases' variable as parameters, and storing its returned array in 'arr' variable.

        int countOfNegativeNum = getNegativeNum(arr);  // Calling getNegativeNum method with 'arr' array as parameter and storing its returned integer value in 'countOfNegativeNum' variable. Note that this value will always be zero (0).
    }
}