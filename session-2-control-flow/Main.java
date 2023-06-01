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
