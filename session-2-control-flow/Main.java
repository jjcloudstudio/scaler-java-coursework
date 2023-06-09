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

    static int[][] takeArray2D(Scanner sc, int total_cases) {
        int[][] arr = new int[total_cases][total_cases];
        for (int i = 0; i < total_cases; i++) {
            for (int j = 0; j < total_cases; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public void rotateMatrix90degreeClockwise(int[][] A) {
        // First, we perform the matrix transposition.
        // A.length gives us the size of the matrix.
        // Transposition is achieved by swapping elements at position (i,j) with elements at position (j,i)
        // We only iterate up to j=i to avoid swapping elements back to their original position
        for(int i=0; i<A.length; i++){
            for(int j=i; j<A[i].length; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // After transposition, we reverse each row to achieve the final rotated matrix.
        // The inner loop only goes up to A.length/2 because we're swapping elements across the midpoint
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length-1-j];
                A[i][A[i].length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cases = takeArraySize(sc);
        int[] arr1 = takeArray(sc, total_cases);
        int[][] arr2 = takeArray2D(sc, total_cases);
        int[] ansMatrix = UniqueElements(arr1);
        System.out.println(Arrays.toString(ansMatrix)); 

        rotateMatrix90degreeClockwise(arr2, arr2);
    }
}
