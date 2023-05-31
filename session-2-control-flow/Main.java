/**
 * This program takes input from the user in the form of a 2D array and prints it out
 * in wave form. In wave form, each row is printed left to right if its index is even,
 * and right to left if its index is odd.
 *
 * The program defines two static methods: takeInput() and print2DArrayWaveForm().
 *
 * - takeInput(): Takes input from the user in the form of two integers n and m (the
 *                dimensions of the 2D array) followed by n*m integers (the elements
 *                of the array). It returns a 2D integer array with these values.
 *
 * - print2DArrayWaveForm(int mat[][]): Prints out a given 2D integer array in wave 
 *                                      form as described above.
 */
import java.util.*;

public class Main {    
    static void print2DArrayWaveForm(int mat[][]){
        for(int i=0;i<mat.length;i++){
            if(i%2==0){
                for(int j=0;j<mat[i].length;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int j=mat[i].length-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }

    static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = takeInput();
        print2DArrayWaveForm(mat);
    }
} 
