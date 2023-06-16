import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int takeArraySize(Scanner sc) {
        int total_cases = sc.nextInt();
        return total_cases;
    }

    static int[] takeArray(Scanner sc, int total_cases) {
        int[] arr = new int[total_cases];
        for (int i = 0; i < total_cases; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    //take string input from user
    static String takeString(Scanner sc) {
        String str = sc.nextLine();
        return str;
    }

    //how to reverse a string
    static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    static String countString(String str){
        //get length of string
        int len = str.length();
        
    }
    
    
    public static printUpperLowerCases(String str){
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCaseCount++;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCaseCount++;
            }
        }
        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
        

    }

    // int arr[][] = new int[N][M];
    // ArrayList<Interger> al = new ArrayList<>();
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cases = takeArraySize(sc);
        int[] arr1 = takeArray(sc, total_cases);
        int[][] arr2 = takeArray2D(sc, total_cases); 

        allDiagonalSum(arr2, arr2);
    }
}

