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
    
    
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();
    
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
    
        for(int i=0; i < n;i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            for(int j=0; j < m;j++) {
                if(A.get(i).get(j) % 2 == 0) {
                    temp.add(A.get(i).get(j));
                }
            }
        
            ans.add(temp);
        }
    
        return ans;
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
