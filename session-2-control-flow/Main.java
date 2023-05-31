
import java.lang.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size_of_array = scn.nextInt();
        int arr[] = new int[size_of_array];
        
        for(int i=0; i<size_of_array; i++) {
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }    
        }
        System.out.println(max);
    }
}