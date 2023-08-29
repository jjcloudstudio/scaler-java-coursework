import java.lang.reflect.Array;
import java.util.*;

public class Module2Day1 {
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
    //declare java class
    static class Student {
        String name;
        int roll_no;
        int marks;

        //constructor
        Student(String name, int roll_no, int marks) {
            this.name = name;
            this.roll_no = roll_no;
            this.marks = marks;
        }

        //method
        void printDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Roll No: " + this.roll_no);
            System.out.println("Marks: " + this.marks);
        }
    }

    public static findUniqueElement(int[] arr){
        int unique = 0;
        for(int i=0; i<arr.length; i++){
            unique = unique ^ arr[i];
        }
        return unique;
    }
    
    public static String maxCharInString(String A){
        char[] charArray = A.toCharArray();
        Arrays.sort(charArray);
        int max_count = 0;
        char max_char = charArray[0];
        for(int i=0; i<charArray.length; i++){
            int current_max_count = 0;
            for(int j=i+1; j<charArray.length-1; j++){
                if(charArray[i] == charArray[j]){
                    current_max_count++;
                }
            }
            if(current_max_count > max_count){
                max_count = current_max_count;
                max_char = charArray[i];
            }
        }
        return String.valueOf(max_char);

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

