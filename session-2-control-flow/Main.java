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

    static int[] NumOfElementGreaterThanItself(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            max = Math.max(max, A[i]);
        }
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] < max){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cases = takeArraySize(sc);
        int[] arr = takeArray(sc, total_cases);
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] reverse_PartOf_Array = NumOfElementGreaterThanItself(arr);
    }
} 
