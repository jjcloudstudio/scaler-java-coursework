import java.util.*;

public class Main {    
    static int countEvenMinusOddNum(int[] A){
        
    }

    static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int total_cases = sc.nextInt();
        for(int i=0; i<total_cases; i++){
            int size = sc.nextInt();
            int[] A = new int[size];
            int evenCount = 0;
            int oddCount = 0;

            for(int j=0; j<size; j++){
                A[j] = sc.nextInt();
                if(A[j]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }


        }
    }

    public static void main(String[] args) {
        //que: how to take whole array as input
        
        
        int[] A = takeInput();
        System.out.println(countEvenMinusOddNum(A));
    }
} 
