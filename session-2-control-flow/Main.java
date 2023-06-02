import java.lang.reflect.Array;
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

    static int[] getEvenNumbers(int[] A){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        int j = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2 == 0){
                evenNumbers.add(A[i]);
            }
        }
        int[] result = new int[evenNumbers.size()];
        for(int i=0; i<evenNumbers.size(); i++){
            result[i] = evenNumbers.get(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cases = takeArraySize(sc);
        int[] arr = takeArray(sc, total_cases);
        int[] evenNumbers = getEvenNumbers(arr);
        System.out.println(Arrays.toString(evenNumbers));
        
    }
} 
