import java.util.*;

public class Main {    
    
    static int takeArraySize(Scanner sc){
        int total_cases = sc.nextInt();
        return total_cases;
    }

    static int[] takeArray(Scanner sc, int total_cases){
        int[] arr = new int[total_cases];
        for(int i=0; i<total_cases; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int[] rightShift_ofArray(int[] A){
        int[] rightShiftOfArray2 = new int[A.length];
        int lastElement = A[A.length-1];
        for(int i=0; i<A.length-1; i++){
            rightShiftOfArray2[i+1] = A[i];
        }
        rightShiftOfArray2[0] = lastElement;
        for(int i=0; i<rightShiftOfArray2.length; i++){
            System.out.print(rightShiftOfArray2[i] + " ");
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cases = takeArraySize(sc);
        int[] arr = takeArray(sc, total_cases);
        int[] rightShiftOfArray = rightShift_ofArray(arr);
    }
} 
