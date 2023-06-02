import java.util.*;

public class Main {

    static int[][] takeArray(Scanner sc, int rows, int columns){
        int[][] arr = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static int[][] addTwoMatrix(int[][] A, int[][]B){
        int n=A.length;
        int m=A[0].length;
        int[][] C = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr1 = takeArray(sc, rows, columns);
        int[][] arr2 = takeArray(sc, rows, columns);
        int[][] addedThirdMatrix = addTwoMatrix(arr1, arr2);
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(addedThirdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
